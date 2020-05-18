package com.example.miocarditepediatrica.service;

import com.example.miocarditepediatrica.domain.user.Patient;
import com.example.miocarditepediatrica.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PatientServiceAdapter implements PatientServicePort {

    @Autowired
    PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        Patient inserted = patientRepository.insert(patient);
        return inserted;
    }

    public boolean deletePatient(String id) {
        boolean exists = patientRepository.existsById(id);
        if (exists) {
            patientRepository.deleteById(id);
        }
        return exists;
    }

    public boolean updatePatient(String id, Patient patient) {
        boolean exists = patientRepository.existsById(id);
        if (exists) {
            patientRepository.save(patient);
        }
        return exists;
    }

    public Optional<Patient> findById(String id) {
        return patientRepository.findById(id);
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public boolean addExamListToPatient(String patientId, List<String> examIds){

        return true;
    }
}
