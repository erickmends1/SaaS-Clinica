package com.clinica.SaaS_Clinica.repository;

import com.clinica.SaaS_Clinica.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
