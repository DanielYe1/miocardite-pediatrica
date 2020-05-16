package com.example.miocarditepediatrica.application;

public interface MessageServicePort {
    void processDoctorMessage(String message);

    void processPatientMessage(String message);
}
