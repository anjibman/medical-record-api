package com.example.springboot.MedicalRecord.modal;

public class VisitRecord {
    private Long timeStamp;
    private String visitReport;

    public VisitRecord() {
    }

    public VisitRecord(Long timeStamp, String visitReport) {
        this.timeStamp = timeStamp;
        this.visitReport = visitReport;
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
        return "MedicalRecord [timeStamp=" + timeStamp + ", visitReport=" + visitReport + "]";
    }

    

    
    


}
