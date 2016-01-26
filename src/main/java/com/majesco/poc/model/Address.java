package com.majesco.poc.model;

/**
 * @author Biplab Nayak
 */
public class Address {

    private String houseNumber;
    private String buildingNumber;
    private String street;
    private String postCode;

    public Address(String houseNumber, String buildingNumber, String street, String postCode) {
        this.houseNumber = houseNumber;
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.postCode = postCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
