package com.example.miocarditepediatrica.domain;

import java.util.List;

public class Patient {
    private String id;
    private String name;
    private List<String> responsibleIds;
    private String height;
    private String weight;
    private String birthDate;
    private Authentication authentication;
    private SensibleData sensibleData;

    public Patient(String id, String name, List<String> responsibleIds, String height, String weight, String birthDate) {
        this.id = id;
        this.name = name;
        this.responsibleIds = responsibleIds;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", responsibleName='" + responsibleIds + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    private SensibleData retrieveSensibleData(String id){
        if(responsibleIds.contains(id)){
            return this.sensibleData;
        }
        return null;
    }

    private Boolean validateLogin(String user, String password){
        return this.authentication.verifyLogin(user, password);
    }
}
