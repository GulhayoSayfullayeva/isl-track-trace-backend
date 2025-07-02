package org.acme.classes;

public class VoyageData {

    public VoyageData(String voyageNumber, boolean empty, boolean dangerousGoods, String shippingCompanyCode,
            String vessel, String vesselIMO) {
        this.voyageNumber = voyageNumber;
        this.empty = empty;
        this.dangerousGoods = dangerousGoods;
        this.shippingCompanyCode = shippingCompanyCode;
        this.vessel = vessel;
        this.vesselIMO = vesselIMO;
    }

    public String voyageNumber;
    public boolean empty = true;
    public boolean dangerousGoods = false;
    public String shippingCompanyCode;
    public String vessel;
    public String vesselIMO;

}
