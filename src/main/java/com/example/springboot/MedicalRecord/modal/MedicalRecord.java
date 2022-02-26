package com.example.springboot.MedicalRecord.modal;

import java.util.List;

public class MedicalRecord {
    Patient patient;
    List<VisitRecord> visitRecords;
    
    public MedicalRecord(Patient patient, List<VisitRecord> visitRecords) {
        this.patient = patient;
        this.visitRecords = visitRecords;
    }

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public List<VisitRecord> getVisitRecords() {
        return visitRecords;
    }
    public void setVisitRecords(List<VisitRecord> visitRecords) {
        this.visitRecords = visitRecords;
    }

    @Override
    public String toString() {
        return "MedicalRecord [patient=" + patient + ", visitRecords=" + visitRecords + "]";
    }
}