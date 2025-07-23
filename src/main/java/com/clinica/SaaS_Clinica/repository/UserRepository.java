package com.clinica.SaaS_Clinica.repository;

import com.clinica.SaaS_Clinica.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
