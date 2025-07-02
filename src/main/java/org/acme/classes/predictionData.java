package org.acme.classes;

import java.util.Date;

public class predictionData {
   public Date estimatedTimeOfAvailability;
   public Date lastUpdated;
   public predictionData(Date estimatedTimeOfAvailability, Date lastUpdated) {
    this.estimatedTimeOfAvailability = estimatedTimeOfAvailability;
    this.lastUpdated = lastUpdated;
   }
   
}
