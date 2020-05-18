package com.example.miocarditepediatrica.service;

import com.example.miocarditepediatrica.domain.user.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientServicePort {
    Patient addPatient(Patient doctor);
    boolean deletePatient(String id);
    boolean updatePatient(String id, Patient doctor);
    Optional<Patient> findById(String id);
    List<Patient> findAll();
    boolean addDiagnosticToPatient(String patientId, String diagnostic);
}
