package org.acme;

import java.util.ArrayList;
import java.util.Date;

public class Container {


    public class HistoricalStatusUpdate {
        public String type;
        public String transportMode;
        public Date timestamp;
        public String additionalInfo;
    }

    public class MasterData {
        public String containerNumber;
        public String length;
        public String height;
        public String isoCode;
    }

    public class PortOfDestination {
        public String name;
        public String code;
    }

    public class PortOfOrigin {
        public String name;
        public String code;
    }

    public class Predictions {
        public Date estimatedTimeOfAvailability;
        public Date lastUpdated;
    }

    public class TerminalOfDestination {
        public String name;
        public String code;
    }

    public class TerminalOfOrigin {
        public String name;
        public String code;
    }

    public class VoyageData {
        public String voyagenumber;
        public boolean empty;
        public boolean dangerousGoods;
        public String shippingCompanyCode;
        public String vessel;
        public String vesselIMO;
        public PortOfOrigin portOfOrigin;
        public TerminalOfOrigin terminalOfOrigin;
        public PortOfDestination portOfDestination;
        public TerminalOfDestination terminalOfDestination;
    }


    public MasterData masterData;
    public VoyageData voyageData;
    public ArrayList<HistoricalStatusUpdate> historicalStatusUpdates;
    public Predictions predictions;
    public Date lastUpdate;
    public String source;

    
}
