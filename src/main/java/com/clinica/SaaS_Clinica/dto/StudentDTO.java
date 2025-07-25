package com.clinica.SaaS_Clinica.dto;

import com.clinica.SaaS_Clinica.domain.Student;

import java.io.Serializable;

public class StudentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String cpf;
    private String schoolRegistration;

    public StudentDTO(){
    }

    public StudentDTO(Student obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
        phone = obj.getPhone();
        cpf = obj.getCpf();
        schoolRegistration = obj.getSchoolRegistration();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSchoolRegistration() {
        return schoolRegistration;
    }

    public void setSchoolRegistration(String schoolRegistration) {
        this.schoolRegistration = schoolRegistration;
    }
}
