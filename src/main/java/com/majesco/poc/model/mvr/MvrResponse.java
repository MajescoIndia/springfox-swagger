package com.majesco.poc.model.mvr;


import java.util.List;

/**
 * @author Biplab Nayak
 */
public class MvrResponse {
    private List<MvrOutputDetails> mvrResponseDetailses;

    public List<MvrOutputDetails> getMvrResponseDetailses() {
        return mvrResponseDetailses;
    }

    public void setMvrResponseDetailses(List<MvrOutputDetails> mvrResponseDetailses) {
        this.mvrResponseDetailses = mvrResponseDetailses;
    }
}
