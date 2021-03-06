package com.example.springboot.MedicalRecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.example.springboot.MedicalRecord.modal.MedicalRecord;
import com.example.springboot.MedicalRecord.modal.Patient;
import com.example.springboot.MedicalRecord.modal.VisitRecord;
import com.github.javafaker.Faker;

import org.springframework.stereotype.Service;

@Service
public class MedicalRecordHardcodedService {
    private static List<Patient> patients = new ArrayList<>();

    static {
        patients.add(generatePatient());
        patients.add(generatePatient());
        patients.add(generatePatient());
        patients.add(generatePatient());
    }

    public List<MedicalRecord> findAll() {
        List<MedicalRecord> medicalRecords = patients.stream().map(p -> {
            List<VisitRecord> visitRecords = Collections.singletonList(generateRandomMedicalRecord());
            
            return new MedicalRecord(p, visitRecords);
        }).collect(Collectors.toList());
        
        return medicalRecords;
    }

    public MedicalRecord findById(String id) {
        Patient patient = patients.stream().filter(p -> p.getId().equals(id)).findFirst().get();
        List<VisitRecord> visitRecords = Collections.singletonList(generateRandomMedicalRecord());

        return new MedicalRecord(patient, visitRecords);        
    }

    private static Patient generatePatient() {
        Faker faker = new Faker();

        String id = UUID.randomUUID().toString();
        String name = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        
        return new Patient(id, name, email, phoneNumber);
    }

    private static VisitRecord generateRandomMedicalRecord() {
        Faker faker = new Faker();

        Long timestamp = faker.date().birthday().getTime();
        String visitLog = faker.lorem().sentence();        

        return new VisitRecord(timestamp, visitLog);
    }

}
