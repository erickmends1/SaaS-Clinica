package com.clinica.SaaS_Clinica.service;

import com.clinica.SaaS_Clinica.domain.User;
import com.clinica.SaaS_Clinica.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        List<User> list = repository.findAll();
        return list;
    }

    public User insert(User obj){
        return  repository.save(obj);
    }
}
