package org.acme;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PortCallService {

    public List<PortCall> portCalls = new ArrayList<PortCall>();
    
    public PortCallService() {
        this.portCalls.add(new PortCall(new Date(), "DIONE", "INGO", "Bremerhaven", "DEBRV", "NTB", "NTB", "TO_COME", "RPH", "15E25", 
        "15E25", "RPH-Barge RPH", new Date(), new Date(), new Date()));

    }

    public List<PortCall> getPortCalls(){
        InputStream is = getClass().getClassLoader().getResourceAsStream("portCall.json");
        return this.portCalls;
    }

    public PortCall getPortCall(String vesselName){
        for ( PortCall portcall: portCalls){
            if( portcall.vesselName.equals(vesselName)){
                return portcall;
            }
        }
        return null;
    }

}
