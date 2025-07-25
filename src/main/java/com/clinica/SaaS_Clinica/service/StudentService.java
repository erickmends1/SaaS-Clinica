package com.clinica.SaaS_Clinica.service;

import com.clinica.SaaS_Clinica.domain.Student;
import com.clinica.SaaS_Clinica.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> findAll(){
        List<Student> list = repository.findAll();
        return list;
    }

    public Student insert(Student obj){
        return  repository.save(obj);
    }
}
