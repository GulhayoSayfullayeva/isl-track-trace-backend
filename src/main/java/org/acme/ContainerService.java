package org.acme;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.acme.classes.MasterData;
import org.acme.classes.VoyageData;
import org.acme.classes.historicalData;
import org.acme.classes.historicalDataItem;
import org.acme.classes.portDestination;
import org.acme.classes.portOrigin;
import org.acme.classes.predictionData;
import org.acme.classes.terminalDestination;
import org.acme.classes.terminalOrigin;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ContainerService {

    List<Container> containers = new ArrayList<Container>();

    public ContainerService() {
        List<historicalDataItem> items = new ArrayList<historicalDataItem>();
        items.add(new historicalDataItem("Terminal In", new Date(), ""));
        items.add( new historicalDataItem("Departure", new Date(), ""));
        items.add( new historicalDataItem("Loaded", new Date(), "Halterm  Container Terminal"));
        items.add( new historicalDataItem("Commercial Clearance Status", new Date(),"Cleared by shipping Company") );
        items.add(new historicalDataItem("Arrival", new Date(), "EMMA Mersk"));
        items.add(  new historicalDataItem("Discharged", new Date(), "Eurogate Terminal"));

        this.addItem(new Container(new MasterData("BMOU2315797", "20", "8.6", "22G1"),
                new portOrigin("Halifax", "CAHAL"),
                new terminalOrigin("Halterm Container Terminal", "CAHALHAL"),
                new portDestination("Wilhemshaven", "DEWVN"),
                new terminalDestination("Eurogate Container Terminal WHV", "DEWVNCT"),
                new VoyageData("513W", false, false, "MAE", "Emma Maersk", "9321483"),
                new Date(),
                "ISL Containerstatus Service",
                new historicalData(items),
                new predictionData(new Date(), new Date())));

                
        this.addItem(new Container(new MasterData("BMOU2315797", "20", "8.6", "22G1"),
                new portOrigin("Halifax", "CAHAL"),
                new terminalOrigin("Halterm Container Terminal", "CAHALHAL"),
                new portDestination("Wilhemshaven", "DEWVN"),
                new terminalDestination("Eurogate Container Terminal WHV", "DEWVNCT"),
                new VoyageData("513W", false, false, "MAE", "Emma Maersk", "9321483"),
                new Date(),
                "ISL Containerstatus Service",
                new historicalData(items),
                new predictionData(new Date(), new Date())));
                
    }

    public void addItem(Container container) {
        this.containers.add(container);
    
    }

    InputStream is = getClass().getClassLoader().getResourceAsStream("container.json");

    public List<Container> getContainers() {
        return containers;
    }

    public Container getContainer(String name) {
        for (Container container : containers) {
            if (container.masterData.containerNumber.contains(name)) {
                return container;
            }
        }
        return null;
    }

}
