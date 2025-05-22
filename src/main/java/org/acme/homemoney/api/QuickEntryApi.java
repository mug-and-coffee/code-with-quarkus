package org.acme.homemoney.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.homemoney.config.CustomMapper;
import org.acme.homemoney.model.QuickEntry;
import org.acme.homemoney.service.QuickEntryService;
import org.acme.model.poc.TestObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Path("/quickentry")
public class QuickEntryApi {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAll() {
        ObjectMapper mapper = CustomMapper.build();
        List<QuickEntry> entries = new ArrayList<>();

        String jsonVal = "";
        try {
            jsonVal = mapper.writeValueAsString(entries);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return jsonVal;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean saveQuickEntry(QuickEntry entry) {
        System.out.println(entry);
        if(entry.getSubject() == null || entry.getRecipient() == null || entry.getPrice() == null) {
            System.out.println("OH NO");
            return Boolean.FALSE;
        }

        boolean result = QuickEntryService.addQuickEntry(entry);
        System.out.println(result);
        return result;
    }
}
