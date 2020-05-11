package com.example.miocarditepediatrica.domain;

public class Patient {
    private String id;
    private String name;
    private String responsibleName;
    private String height;
    private String weight;
    private String birthDate;

    public Patient(String id, String name, String responsibleName, String height, String weight, String birthDate) {
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
}
