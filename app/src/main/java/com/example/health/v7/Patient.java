package com.example.health.v7;

public class Patient {
    private String name;
    private String age;
    private String martial;
    private String num_fam;
    private String addr;
    private String ward;
    private String block;
    private String district;
    private String state;
    private String occupation;
    private String aadhar;
    private String cont1;
    private String cont2;

    public Patient() {
    }

    public Patient(String name, String age, String martial, String num_fam, String addr, String ward, String block, String district, String state, String occupation, String aadhar, String cont1, String cont2) {
        this.name = name;
        this.age = age;
        this.martial = martial;
        this.num_fam = num_fam;
        this.addr = addr;
        this.ward = ward;
        this.block = block;
        this.district = district;
        this.state = state;
        this.occupation = occupation;
        this.aadhar = aadhar;
        this.cont1 = cont1;
        this.cont2 = cont2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMartial() {
        return martial;
    }

    public void setMartial(String martial) {
        this.martial = martial;
    }

    public String getNum_fam() {
        return num_fam;
    }

    public void setNum_fam(String num_fam) {
        this.num_fam = num_fam;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getCont1() {
        return cont1;
    }

    public void setCont1(String cont1) {
        this.cont1 = cont1;
    }

    public String getCont2() {
        return cont2;
    }

    public void setCont2(String cont2) {
        this.cont2 = cont2;
    }
}

