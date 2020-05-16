package com.example.miocarditepediatrica.domain;

import java.util.List;

public class Patient {
    private String id;
    private String name;
    private List<String> responsibleName;
    private String height;
    private String weight;
    private String birthDate;
    private Authentication authentication;
    private SensibleData sensibleData;

    public Patient(String id, String name, List<String> responsibleName, String height, String weight, String birthDate) {
        this.id = id;
        this.name = name;
        this.responsibleName = responsibleName;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", responsibleName='" + responsibleName + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    private SensibleData retrieveSensibleData(String name){
        if(responsibleName.contains(name)){
            return this.sensibleData;
        }
        return null;
    }
}
