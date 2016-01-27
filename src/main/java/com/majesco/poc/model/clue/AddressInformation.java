package com.majesco.poc.model.clue;


/**
 * @author Biplab Nayak
 */
public class AddressInformation {

    private String apartmentNo;
    private String city;
    private Integer coveragePartTermID;
    private String houseNo;
    private Integer policyTermID;
    private String state;
    private String streetName;
    private String zipCode;
    private String zipCodeSuffix;

    public String getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCoveragePartTermID() {
        return coveragePartTermID;
    }

    public void setCoveragePartTermID(Integer coveragePartTermID) {
        this.coveragePartTermID = coveragePartTermID;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public Integer getPolicyTermID() {
        return policyTermID;
    }

    public void setPolicyTermID(Integer policyTermID) {
        this.policyTermID = policyTermID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCodeSuffix() {
        return zipCodeSuffix;
    }

    public void setZipCodeSuffix(String zipCodeSuffix) {
        this.zipCodeSuffix = zipCodeSuffix;
    }
}
