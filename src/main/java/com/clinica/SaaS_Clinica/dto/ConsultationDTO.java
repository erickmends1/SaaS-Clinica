package com.clinica.SaaS_Clinica.dto;

import com.clinica.SaaS_Clinica.domain.Consultation;
import com.clinica.SaaS_Clinica.domain.Patient;
import com.clinica.SaaS_Clinica.domain.enums.StatusConsultation;

import java.io.Serializable;
import java.time.Instant;

public class ConsultationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Instant dateHour;
    private String specialty;
    private String professional;
    private Integer status;
    private Patient patient;

    public ConsultationDTO(){
    }

    public ConsultationDTO(Consultation obj) {
        id = obj.getId();
        dateHour = obj.getDateHour();
        specialty = obj.getSpecialty();
        professional = obj.getProfessional();
        setStatus(obj.getStatus());
        patient = obj.getPatient();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDateHour() {
        return dateHour;
    }

    public void setDateHour(Instant dateHour) {
        this.dateHour = dateHour;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public StatusConsultation getStatus() {
        return StatusConsultation.valueOf(status);
    }

    public void setStatus(StatusConsultation status) {
        this.status = status.getCode();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
