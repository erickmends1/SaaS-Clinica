package com.clinica.SaaS_Clinica.domain;

import com.clinica.SaaS_Clinica.domain.enums.StatusConsultation;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_consultation")
public class Consultation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant dateHour;
    private String specialty;
    private String professional;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Consultation(){
    }

    public Consultation(Long id, Instant dateHour, String specialty, String professional, Patient patient, StatusConsultation status) {
        this.id = id;
        this.dateHour = dateHour;
        this.specialty = specialty;
        this.professional = professional;
        this.patient = patient;
        setStatus(status);
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public StatusConsultation getStatus() {
        return StatusConsultation.valueOf(status);
    }

    public void setStatus(StatusConsultation status) {
        this.status = status.getCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consultation consultation = (Consultation) o;
        return Objects.equals(id, consultation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
