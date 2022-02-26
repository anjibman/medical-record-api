package com.example.springboot.MedicalRecord.modal;

public class VisitRecord {
    private String id;
    private Long timeStamp;
    private String visitReport;

    public VisitRecord() {
    }

    public VisitRecord(String id, Long timeStamp, String visitReport) {
        this.id = id;
        this.timeStamp = timeStamp;
        this.visitReport = visitReport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getVisitReport() {
        return visitReport;
    }

    public void setVisitReport(String visitReport) {
        this.visitReport = visitReport;
    }

    @Override
    public String toString() {
        return "MedicalRecord [id=" + id + ", timeStamp=" + timeStamp + ", visitReport=" + visitReport + "]";
    }

    

    
    


}
