package com.clinica.SaaS_Clinica.config;

import com.clinica.SaaS_Clinica.domain.*;
import com.clinica.SaaS_Clinica.domain.enums.Role;
import com.clinica.SaaS_Clinica.domain.enums.StatusConsultation;
import com.clinica.SaaS_Clinica.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private ProfessionalRepository professionalRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Erick Mendes", "erick.mendes@clinical.org.br", "98970188273", "123", Role.ADIM);
        User u2 = new User(null, "Maria Eduarda", "maria.eduarda@clinical.org.br", "98970658273", "123", Role.ATENDENTE);
        User u3 = new User(null, "Roberto Mendes", "roberto.mendes@clinical.org.br", "989701976453", "123", Role.NUTRICIONISTA);
        userRepository.saveAll(Arrays.asList(u1, u2, u3));

        Patient p1 = new Patient(null, "Douglas Nogueira", "douglas@gmail.com", "98706854321", LocalDate.parse("2004-07-16"), "12309876501");
        Patient p2 = new Patient(null, "Alice Raquel", "alice@gmail.com", "9870128273", LocalDate.parse("2005-08-13"), "87612343299");
        Patient p3 = new Patient(null, "Antonio Carlos", "carlos@gmail.com", "9870827413", LocalDate.parse("2001-02-18"), "09876556700");
        patientRepository.saveAll(Arrays.asList(p1, p2, p3));

        Professional pro1 = new Professional(null, "Peter Jhon", "peter.jhon@professor.undb.edu.br", "98960122275", "12332109800", "002-026157");
        professionalRepository.saveAll(Arrays.asList(pro1));

        Student st1 = new Student(null, "Luiza Souza", "luiza.souza@aluno.undb.edu.br", "98970659831", "98912333200", "002-029123");
        studentRepository.saveAll(Arrays.asList(st1));

        Consultation con1 = new Consultation(null, Instant.parse("2025-07-24T15:30:00Z"),"NUTRICIONISTA", u3.getName(), p1, StatusConsultation.AGENDADA);
        consultationRepository.saveAll(Arrays.asList(con1));




    }
}
