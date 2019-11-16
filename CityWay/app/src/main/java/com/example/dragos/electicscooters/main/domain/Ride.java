package com.example.dragos.electicscooters.main.domain;

import com.google.firebase.database.Exclude;

import java.time.LocalDateTime;

public class Ride implements IEntityID<Integer>{
    public Integer id;
    public Integer userId;
    public Integer scooterId;
    public LocalDateTime startTime;
    public LocalDateTime endTime;

    public Ride(){}

    /**
     * Ride class constructor
     * @param id - RideId
     * @param userId - userId
     * @param scooterId - scooterId
     * @param startTime - ride start
     * @param endTime - ride end
     */
    public Ride(Integer id, Integer userId,
                Integer scooterId, LocalDateTime startTime,
                LocalDateTime endTime){
        this.endTime = endTime;
        this.startTime = startTime;
        this.id= id;
        this.userId = userId;
        this.scooterId = scooterId;
    }

    /**
     * Getters and setters
     *
     */
    @Exclude
    @Override
    public Integer getId() {
        return id;
    }

    @Exclude
    @Override
    public void setId(Integer rideId) {
        this.id = rideId;
    }

    public Integer getScooterId() {
        return scooterId;
    }

    public Integer getUserId() {
        return userId;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setScooterId(Integer scooterId) {
        this.scooterId = scooterId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object ot){
        if(ot == null){
            return false;
        }

        if(ot == this){
            return true;
        }

        if(ot.getClass() != this.getClass()){
            return false;
        }

        Ride rd = (Ride) ot;
        return this.id.equals(((Ride) ot).getId());
    }

}
