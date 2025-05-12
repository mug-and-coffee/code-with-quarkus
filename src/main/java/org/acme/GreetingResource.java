package org.acme;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.TestEnum;
import org.acme.model.TestObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello_get() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        TestObject testObject = new TestObject(12L, 435,
                "Bobby", LocalDate.now(), TestEnum.THREE, false, Double.parseDouble("34.5"), 66.34f);

        String jsonVal = "";
        try {
            jsonVal = mapper.writeValueAsString(testObject);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return jsonVal;
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Boolean hello_post() {


        return Boolean.TRUE;
    }
}
