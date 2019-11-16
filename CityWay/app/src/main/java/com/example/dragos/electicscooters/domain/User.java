package com.example.dragos.electicscooters.domain;

import com.google.firebase.database.Exclude;

public class User implements HasID<String> {

    private String idUser;
    private String name;

    public User(){ }

    public User(String id, String name){
        this.idUser=id;
        this.name=name;
    }


    public String getIdUser() {return idUser;}

    public void setIdUser(String id) {
        this.idUser = id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    @Exclude
    @Override
    public String getID() {
        return idUser;
    }

    @Exclude
    @Override
    public void setID(String s) {
        idUser=s;
    }
}