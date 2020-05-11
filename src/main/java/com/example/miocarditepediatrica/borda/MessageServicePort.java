package com.example.miocarditepediatrica.borda;

public interface MessageServicePort {
    void processDoctorMessage(String message);

    void processPatientMessage(String message);
}
