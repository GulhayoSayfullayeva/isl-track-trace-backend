package org.acme;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;


@Path("")
public class PortCallResource {
   
    @Inject
    PortCallService service;
    

    @GET
    @Path("/portCalls")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPortCalls() throws Exception {
        
        return Response.ok(service.getPortCalls()).build();

    }

    @GET
    @Path("/portCalls/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPortCall(String vessel){
        
        PortCall portCall = service.getPortCall(vessel);
        return (portCall == null) ? Response.status(404).entity("Not Found").build() : Response.ok(portCall).build();
    }

    
        
    

}
