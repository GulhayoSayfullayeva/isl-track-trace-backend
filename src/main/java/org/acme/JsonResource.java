package org.acme;

import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;



@Path("")
public class JsonResource {
   
   
   
    @GET
    @Path("/containers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContainers() throws Exception {
        InputStream is = getClass().getClassLoader().getResourceAsStream("container.json");
        ObjectMapper mapper = new ObjectMapper();
        return Response.ok(mapper.readValue(is, Container.class)).build();
        
    
    }

    
    @GET
    @Path("/portCalls")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPortCalls() throws Exception {
        InputStream is = getClass().getClassLoader().getResourceAsStream("portCall.json");
        ObjectMapper mapper = new ObjectMapper();
        return Response.ok(mapper.readValue(is, new TypeReference<List<PortCall>>()  {})).build();
        
    
    }
    
}
