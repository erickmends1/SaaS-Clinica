package com.clinica.SaaS_Clinica.service;

import com.clinica.SaaS_Clinica.domain.Patient;
import com.clinica.SaaS_Clinica.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    public List<Patient> findAll(){
        List<Patient> list = repository.findAll();
        return list;
    }
}
