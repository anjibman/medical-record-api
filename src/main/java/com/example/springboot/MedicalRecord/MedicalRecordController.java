package com.example.springboot.MedicalRecord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class MedicalRecordController {
    @Autowired
    private MedicalRecordHardcodedService medicalRecordHardcodedService;

    @GetMapping("/records")
    public List<MedicalRecord> getAllRecords() {
        return medicalRecordHardcodedService.findAll();
    }

    @GetMapping("/patients/{id}/record")
    public MedicalRecord getPatientRecord(@PathVariable String id) {
        return medicalRecordHardcodedService.findById(id);
    }


}
