package com.clinica.SaaS_Clinica.controller;

import com.clinica.SaaS_Clinica.domain.Professional;
import com.clinica.SaaS_Clinica.dto.ProfessionalDTO;
import com.clinica.SaaS_Clinica.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/professionals")
public class ProfessionalController {

    @Autowired
    private ProfessionalService service;

    @GetMapping
    public ResponseEntity<List<ProfessionalDTO>> findAll(){
        List<Professional> list = service.findAll();
        List<ProfessionalDTO> listDTO = list.stream().map(x -> new ProfessionalDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<ProfessionalDTO> insert(@RequestBody Professional obj){
        Professional professional = service.insert(obj);
        ProfessionalDTO patientDTO = new ProfessionalDTO(professional);
        return ResponseEntity.status(HttpStatus.CREATED).body(patientDTO);
    }
}
