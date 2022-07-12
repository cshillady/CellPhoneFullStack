package com.connorshillady.phoneappbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CellPhone {
  private int PhoneId;
  private double PRICE;
  private String BRAND;
  private int STORAGE;
  
  public CellPhone(@JsonProperty("PhoneId") int PhoneId, @JsonProperty("PRICE") double PRICE,
                   @JsonProperty("BRAND") String BRAND, @JsonProperty("STORAGE") int STORAGE) {
    this.PhoneId = PhoneId;
    this.PRICE = PRICE;
    this.BRAND = BRAND;
    this.STORAGE = STORAGE;
  }
  
  public int getPhoneId() {
    return PhoneId;
  }
  public double getPRICE() {
    return PRICE;
  }
  public String getBRAND() {
    return BRAND;
  }
  public int getSTORAGE() {
    return STORAGE;
  }
  public void setPhoneId(int PhoneId) {
    this.PhoneId = PhoneId;
  }
  public void setPRICE(double PRICE) {
    this.PRICE = PRICE;
  }
  public void setBRAND(String BRAND) {
    this.BRAND = BRAND;
  }
  public void setSTORAGE(int STORAGE) {
    this.STORAGE = STORAGE;
  }
  
  @Override
  public String toString() {
    return "Cell Phone { PhoneID: " + PhoneId + ", Price: $" + PRICE +
        ", Brand: '" + BRAND + "', Storage Size: " + STORAGE + " GB }";
  }
}