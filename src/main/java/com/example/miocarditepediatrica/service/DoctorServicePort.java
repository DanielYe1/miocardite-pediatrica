package com.example.miocarditepediatrica.service;

import com.example.miocarditepediatrica.domain.user.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorServicePort {
    Doctor addDoctor(Doctor doctor);
    boolean deleteDoctor(String id);
    boolean updateDoctor(String id, Doctor doctor);
    Optional<Doctor> findById(String id);
    List<Doctor> findAll();
}
