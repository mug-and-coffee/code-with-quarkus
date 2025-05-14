package org.acme;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.poc.TestEnum;
import org.acme.model.poc.TestObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Path("/hello")
public class GreetingResource {

    private static TestObject getTestObj() {
        TestObject testObject = new TestObject(12L, 435,
                "Bobby", LocalDate.now(), TestEnum.THREE, false, Double.parseDouble("34.5"), 66.34f);
        return testObject;
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello_get() {
        System.out.println("call get");
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        TestObject testObject = getTestObj();

        String jsonVal = "";
        try {
            jsonVal = mapper.writeValueAsString(testObject);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return jsonVal;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TestObject hello_post(TestObject tst) {
        System.out.println("call post");
        System.out.println(tst);
        TestObject result = getTestObj();
        result.setName(tst.getName()+" BLABLA");
        return result;
    }
}
