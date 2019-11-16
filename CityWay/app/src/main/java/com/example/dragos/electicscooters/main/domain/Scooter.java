package com.example.dragos.electicscooters.main.domain;

import com.google.firebase.database.Exclude;

public class Scooter implements IEntityID<Integer>{

    private Integer id;
    private Location location;
    private Integer batteryLevel;
    private String model;
    private String status;

    public Scooter() {}
    /**
     * Constructor for Scooter class
     * @param id - scooter Id
     * @param location - scooter Location
     * @param batteryLevel - scooter battery level
     * @param model - scooter model
     * @param status - scooter status
     */
    public Scooter(Integer id, Location location,
                   Integer batteryLevel, String model,
                   String status){
        this.id = id;
        this.location = location;
        this.batteryLevel = batteryLevel;
        this.model = model;
        this.status = status;

    }

    /**
     * Getters and setters
     */
    @Exclude
    @Override
    public Integer getId() {
        return id;
    }


    @Exclude
    @Override
    public void setId(Integer integer) {
        this.id = integer;
    }

    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    public Location getLocation() {
        return location;
    }

    public String getModel() {
        return model;
    }

    public String getStatus() {
        return status;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Overriding equals method
     * @param obj - object to be compared
     * @return - true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        if(this == obj){
            return true;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        Scooter sct = (Scooter) obj;
        return sct.getId().equals(this.id);
    }
}
