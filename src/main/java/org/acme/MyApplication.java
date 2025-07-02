package org.acme;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/isl-track-trace")
public class MyApplication extends Application {
    @GET
    public String hello() {
        return "Hello, World!";
    }
}