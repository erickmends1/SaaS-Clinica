package com.clinica.SaaS_Clinica.controller;

import com.clinica.SaaS_Clinica.domain.Consultation;
import com.clinica.SaaS_Clinica.dto.ConsultationDTO;
import com.clinica.SaaS_Clinica.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/consultations")
public class ConsultationController {

    @Autowired
    private ConsultationService service;

    @GetMapping
    public ResponseEntity<List<ConsultationDTO>> findAll(){
        List<Consultation> list = service.findAll();
        List<ConsultationDTO> listDTO = list.stream().map(x -> new ConsultationDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<ConsultationDTO> insert(@RequestBody Consultation obj){
        Consultation patient = service.insert(obj);
        ConsultationDTO consultationDTO = new ConsultationDTO(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(consultationDTO);
    }
}
