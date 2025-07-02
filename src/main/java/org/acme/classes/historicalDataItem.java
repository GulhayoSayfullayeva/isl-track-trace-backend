package org.acme.classes;

import java.util.Date;

public class historicalDataItem {
   
    public String type;
    public Date timestamp;
    public String additionalInfo = "";
    public historicalDataItem(String type, Date timestamp, String additionalInfo) {
        this.type = type;
        this.timestamp = timestamp;
        this.additionalInfo = additionalInfo;
    }


    
    
}
