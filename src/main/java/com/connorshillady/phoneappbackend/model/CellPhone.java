package com.connorshillady.phoneappbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CellPhone {
  private final int PhoneId;
  private final double PRICE;
  private final String BRAND;
  private final int STORAGE;
  
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
}