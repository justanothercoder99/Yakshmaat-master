package com.example.health.v7;

public class Medical {
    private String TB_Patient;
    private String Previously_Treated_TB_Patient;
    private String Previous_Exposure;
    private String HIV_positive;
    private String Diagonistic_Tests;
    private String patient_under_doctor;
    private String drugs_provided;
    private String anti_tb;
    private String resistance;
    private String treatment;
    private String successful;

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getSuccessful() {
        return successful;
    }

    public void setSuccessful(String successful) {
        this.successful = successful;
    }

    public Medical(String TB_Patient, String previously_Treated_TB_Patient, String previous_Exposure, String HIV_positive, String diagonistic_Tests, String patient_under_doctor, String drugs_provided, String anti_tb, String resistance, String treatment, String successful) {
        this.TB_Patient = TB_Patient;
        Previously_Treated_TB_Patient = previously_Treated_TB_Patient;
        Previous_Exposure = previous_Exposure;
        this.HIV_positive = HIV_positive;
        Diagonistic_Tests = diagonistic_Tests;
        this.patient_under_doctor = patient_under_doctor;
        this.drugs_provided = drugs_provided;
        this.anti_tb = anti_tb;
        this.resistance = resistance;
        this.treatment = treatment;
        this.successful = successful;
    }

    public Medical() {
    }

    public Medical(String TB_Patient, String previously_Treated_TB_Patient, String previous_Exposure, String HIV_positive, String diagonistic_Tests, String patient_under_doctor, String drugs_provided, String anti_tb, String resistance) {
        this.TB_Patient = TB_Patient;
        Previously_Treated_TB_Patient = previously_Treated_TB_Patient;
        Previous_Exposure = previous_Exposure;
        this.HIV_positive = HIV_positive;
        Diagonistic_Tests = diagonistic_Tests;
        this.patient_under_doctor = patient_under_doctor;
        this.drugs_provided = drugs_provided;
        this.anti_tb = anti_tb;
        this.resistance = resistance;
    }

    public String getTB_Patient() {
        return TB_Patient;
    }

    public void setTB_Patient(String TB_Patient) {
        this.TB_Patient = TB_Patient;
    }

    public String getPreviously_Treated_TB_Patient() {
        return Previously_Treated_TB_Patient;
    }

    public void setPreviously_Treated_TB_Patient(String previously_Treated_TB_Patient) {
        Previously_Treated_TB_Patient = previously_Treated_TB_Patient;
    }

    public String getPrevious_Exposure() {
        return Previous_Exposure;
    }

    public void setPrevious_Exposure(String previous_Exposure) {
        Previous_Exposure = previous_Exposure;
    }

    public String getHIV_positive() {
        return HIV_positive;
    }

    public void setHIV_positive(String HIV_positive) {
        this.HIV_positive = HIV_positive;
    }

    public String getDiagonistic_Tests() {
        return Diagonistic_Tests;
    }

    public void setDiagonistic_Tests(String diagonistic_Tests) {
        Diagonistic_Tests = diagonistic_Tests;
    }

    public String getPatient_under_doctor() {
        return patient_under_doctor;
    }

    public void setPatient_under_doctor(String patient_under_doctor) {
        this.patient_under_doctor = patient_under_doctor;
    }

    public String getDrugs_provided() {
        return drugs_provided;
    }

    public void setDrugs_provided(String drugs_provided) {
        this.drugs_provided = drugs_provided;
    }

    public String getAnti_tb() {
        return anti_tb;
    }

    public void setAnti_tb(String anti_tb) {
        this.anti_tb = anti_tb;
    }

    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }
}
