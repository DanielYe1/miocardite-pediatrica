package com.example.miocarditepediatrica.service;

import com.example.miocarditepediatrica.domain.user.Doctor;
import com.example.miocarditepediatrica.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceAdapter implements DoctorServicePort{

    @Autowired
    DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor){
        Doctor inserted = doctorRepository.insert(doctor);
        return inserted;
    }


    public boolean deleteDoctor(String id) {
        boolean exists = doctorRepository.existsById(id);
        if (exists) {
            doctorRepository.deleteById(id);
        }
        return exists;
    }

    public boolean updateDoctor(String id, Doctor doctor) {
        boolean exists = doctorRepository.existsById(id);
        if (exists) {
            doctor.setId(id);
            doctorRepository.save(doctor);
        }
        return exists;
    }

    public Optional<Doctor> findById(String id) {
        return doctorRepository.findById(id);
    }

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }
}
