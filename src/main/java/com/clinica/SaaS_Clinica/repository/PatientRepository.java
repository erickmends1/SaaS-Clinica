package com.clinica.SaaS_Clinica.repository;

import com.clinica.SaaS_Clinica.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
