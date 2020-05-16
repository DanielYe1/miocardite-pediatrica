package com.example.miocarditepediatrica.repository;

import com.example.miocarditepediatrica.domain.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
