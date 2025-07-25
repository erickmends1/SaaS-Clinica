package com.clinica.SaaS_Clinica.controller;

import com.clinica.SaaS_Clinica.domain.Student;
import com.clinica.SaaS_Clinica.dto.StudentDTO;
import com.clinica.SaaS_Clinica.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public ResponseEntity<List<StudentDTO>> findAll(){
        List<Student> list = service.findAll();
        List<StudentDTO> listDTO = list.stream().map(x -> new StudentDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<StudentDTO> insert(@RequestBody Student obj){
        Student student = service.insert(obj);
        StudentDTO studentDTO = new StudentDTO(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentDTO);
    }
}
