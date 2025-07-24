package com.clinica.SaaS_Clinica.service;

import com.clinica.SaaS_Clinica.domain.Professional;
import com.clinica.SaaS_Clinica.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    @Autowired
    private ProfessionalRepository repository;

    public List<Professional> findAll(){
        List<Professional> list = repository.findAll();
        return list;
    }

    public Professional insert(Professional obj){
        return  repository.save(obj);
    }
}
