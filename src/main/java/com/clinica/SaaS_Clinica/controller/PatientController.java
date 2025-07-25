package com.clinica.SaaS_Clinica.controller;

import com.clinica.SaaS_Clinica.domain.Patient;
import com.clinica.SaaS_Clinica.dto.PatientDTO;
import com.clinica.SaaS_Clinica.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping
    public ResponseEntity<List<PatientDTO>> findAll(){
        List<Patient> list = service.findAll();
        List<PatientDTO> listDTO = list.stream().map(x -> new PatientDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<PatientDTO> insert(@RequestBody Patient obj){
        Patient patient = service.insert(obj);
        PatientDTO patientDTO = new PatientDTO(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(patientDTO);
    }
}
