package com.example.agriculture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Crop {
    @Id
    private String serialNumber;
    private String name;
    private String type;
    private String season;
    private double pricePerKg;

    // Getters and Setters
    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getSeason() { return season; }
    public void setSeason(String season) { this.season = season; }

    public double getPricePerKg() { return pricePerKg; }
    public void setPricePerKg(double pricePerKg) { this.pricePerKg = pricePerKg; }
}
