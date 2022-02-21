package com.example.springboot.MedicalRecord;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MedicalRecordHardcodedService {
    private static List<MedicalRecord> medicalRecords = new ArrayList<>();

    static {
        medicalRecords.add(generateRandomMedicalRecord());
        medicalRecords.add(generateRandomMedicalRecord());
        medicalRecords.add(generateRandomMedicalRecord());
        medicalRecords.add(generateRandomMedicalRecord());
    }

    public List<MedicalRecord> findAll() {
        return medicalRecords;
    }

    public MedicalRecord findById(String id) {
        return medicalRecords.stream().filter(r -> r.getId().equals(id)).findFirst().get();
    }

    private static MedicalRecord generateRandomMedicalRecord() {
        Faker faker = new Faker();

        String name = faker.funnyName().name();
        String email = faker.internet().emailAddress();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String feedback = faker.lorem().sentence();

        return new MedicalRecord(UUID.randomUUID().toString(), name, email, phoneNumber, feedback);
    }


}
