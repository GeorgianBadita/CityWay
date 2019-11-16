package com.example.dragos.electicscooters.main.domain;


import com.google.firebase.database.Exclude;

public class Location implements IEntityID<Integer>{
    private Integer id;
    private Double latitude;
    private Double longitude;

    public Location() {

    }

    /**
     * Constructor for Location class
     * @param id - id of the location
     * @param latitude - latitude of the location
     * @param longitude - longitude of the location
     */
    public Location(Integer id, Double latitude, Double longitude){
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }




    /**
     * Getters and setters
     *
     */
    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object ot){
        if(ot == null){
            return false;
        }

        if(this == ot){
            return true;
        }

        if(this.getClass() != ot.getClass()){
            return false;
        }

        return this.longitude.equals(((Location) ot).getLongitude()) &&
               this.latitude.equals(((Location) ot).getLatitude());
    }

    @Exclude
    @Override
    public Integer getId(){return id;}

    @Exclude
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

}
