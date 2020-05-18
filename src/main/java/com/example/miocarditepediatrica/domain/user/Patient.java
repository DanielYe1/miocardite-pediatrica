package com.example.miocarditepediatrica.domain.user;

import org.springframework.data.annotation.Id;

import java.util.Collections;
import java.util.List;

public class Patient {
    @Id
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

    public void setPatientDiagnostic(String diagnostic){
        this.sensibleData.setDiagnostic(diagnostic);
    }

    public List<String> retrievePatientExams(String responsibleId){
        if(responsibleIds.contains(responsibleId)){
            return this.sensibleData.getExamIds();
        }
        return Collections.emptyList();
    }

    public String retrievePatientDiagnostic(String responsibleId){
        if(responsibleIds.contains(responsibleId)){
            return this.sensibleData.getDiagnostic();
        }
        return "invalid responsibleId";
    }

    private Boolean validateLogin(String user, String password){
        return this.authentication.verifyLogin(user, password);
    }
}
