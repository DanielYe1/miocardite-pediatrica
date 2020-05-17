package com.example.miocarditepediatrica.service.messaging;

public interface MessageServicePort {
    void processDoctorMessage(String message);

    void processPatientMessage(String message);
}
