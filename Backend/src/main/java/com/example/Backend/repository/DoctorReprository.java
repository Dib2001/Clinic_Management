package com.example.Backend.repository;

import com.example.Backend.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorReprository extends JpaRepository<Doctors, Long> {
    Optional<Doctors> findByName(String name);
}
