package com.clinica.SaaS_Clinica.service;

import com.clinica.SaaS_Clinica.domain.Consultation;
import com.clinica.SaaS_Clinica.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository repository;

    public List<Consultation> findAll(){
        List<Consultation> list = repository.findAll();
        return list;
    }

    public Consultation insert(Consultation obj){
        return  repository.save(obj);
    }
}
