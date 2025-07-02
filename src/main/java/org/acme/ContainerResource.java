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

import jakarta.enterprise.context.ApplicationScoped;
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
public class ContainerResource{

    @Inject
    ContainerService service;

    @GET
    @Path("/containers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContainers() throws Exception {

        return Response.ok(service.getContainers()).build();

    }


    @GET
    @Path("/containers/{containerNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContainer(String containerNumber){
        
        Container container = service.getContainer(containerNumber);
        return (container == null) ? Response.status(404).entity("Not found").build() : Response.ok(container).build();
    }

    
    

}
