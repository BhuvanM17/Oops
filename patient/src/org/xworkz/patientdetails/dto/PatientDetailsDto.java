package org.xworkz.patientdetails.dto;

public class PatientDetailsDto {
    private int patientId;
    private String patientName;
    private String originHospital;
    private String destinationHospital;
    private double patientWeight;
    private String transferDate;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getOriginHospital() {
        return originHospital;
    }

    public void setOriginHospital(String originHospital) {
        this.originHospital = originHospital;
    }

    public String getDestinationHospital() {
        return destinationHospital;
    }

    public void setDestinationHospital(String destinationHospital) {
        this.destinationHospital = destinationHospital;
    }

    public double getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(double patientWeight) {
        this.patientWeight = patientWeight;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }
    public PatientDetailsDto(){

    }
}
