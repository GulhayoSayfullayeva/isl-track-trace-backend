package org.acme;

import java.util.Date;

public class PortCall {
    public Date timestamp;
    public String vesselName;
    public String vesselCallSign;
    public String portName;
    public String portCode;
    public String terminalName;
    public String terminalCode;
    public String status;
    public String carrierCode;
    public String incomingVoyageNumber;
    public String outgoingVoyageNumber;
    public String additionalVoyageInfo;
    public Date eta;
    public Date etd;
    public Date receivedAt;
    
    
    public PortCall(Date timestamp, String vesselName, String vesselCallSign, String portName, String portCode,
            String terminalName, String terminalCode, String status, String carrierCode, String incomingVoyageNumber,
            String outgoingVoyageNumber, String additionalVoyageInfo, Date eta, Date etd, Date receivedAt) {
        this.timestamp = timestamp;
        this.vesselName = vesselName;
        this.vesselCallSign = vesselCallSign;
        this.portName = portName;
        this.portCode = portCode;
        this.terminalName = terminalName;
        this.terminalCode = terminalCode;
        this.status = status;
        this.carrierCode = carrierCode;
        this.incomingVoyageNumber = incomingVoyageNumber;
        this.outgoingVoyageNumber = outgoingVoyageNumber;
        this.additionalVoyageInfo = additionalVoyageInfo;
        this.eta = eta;
        this.etd = etd;
        this.receivedAt = receivedAt;
    }
    
   
    
}
