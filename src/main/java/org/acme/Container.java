package org.acme;

import java.util.Date;

import org.acme.classes.MasterData;
import org.acme.classes.VoyageData;
import org.acme.classes.historicalData;
import org.acme.classes.portDestination;
import org.acme.classes.portOrigin;
import org.acme.classes.predictionData;
import org.acme.classes.terminalDestination;
import org.acme.classes.terminalOrigin;

public class Container {
    
    public Container(MasterData masterData, portOrigin portOrigin, terminalOrigin terminalOrigin,
            portDestination portDestination, terminalDestination terminalDestination,
            VoyageData voyageData, Date lastUpdate, String source, historicalData historicalData, predictionData predictiondata) {
        this.masterData = masterData;
        this.portOrigin = portOrigin;
        this.portDestination = portDestination;
        this.terminalOrigin = terminalOrigin;
        this.terminalDestination = terminalDestination;
        this.voyageData = voyageData;
        this.lastUpdate = lastUpdate;
        this.source = source;
        this.historicalData = historicalData;
        this.predictionData = predictiondata;
    }
    
    
    public MasterData masterData;
    public portOrigin portOrigin;
    public portDestination portDestination;
    public terminalOrigin terminalOrigin;
    public terminalDestination terminalDestination;
    public VoyageData voyageData;
    public Date lastUpdate;
    public String source;
    public historicalData historicalData;
    public predictionData predictionData;


    


}
