package com.example.health.v7;

public class Symptom {
    private String text;
    private String other;

    public Symptom() {
    }

    public Symptom(String text, String other) {
        this.text = text;
        this.other = other;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
