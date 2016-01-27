package com.majesco.poc.model.clue;

import java.util.List;

/**
 * @author Biplab Nayak
 */
public class ClueRequest {

    private AddressInformation addressInformation;
    private List<DriverInformation> driverInformation;

    public AddressInformation getAddressInformation() {
        return addressInformation;
    }

    public void setAddressInformation(AddressInformation addressInformation) {
        this.addressInformation = addressInformation;
    }

    public List<DriverInformation> getDriverInformation() {
        return driverInformation;
    }

    public void setDriverInformation(List<DriverInformation> driverInformation) {
        this.driverInformation = driverInformation;
    }

}
