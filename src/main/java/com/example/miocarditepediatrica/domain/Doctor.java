package com.example.miocarditepediatrica.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Doctor implements Serializable {
    @Id
    private String id;
    private String name;
    private String crm;
    private String specialty;
    private String birthDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Doctor(String id, String name, String crm, String specialty, String birthDate) {
        this.id = id;
        this.name = name;
        this.crm = crm;
        this.specialty = specialty;
        this.birthDate = birthDate;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", crm='" + crm + '\'' +
                ", specialty='" + specialty + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}