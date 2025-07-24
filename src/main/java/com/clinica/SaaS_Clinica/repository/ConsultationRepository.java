package com.clinica.SaaS_Clinica.repository;

import com.clinica.SaaS_Clinica.domain.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
