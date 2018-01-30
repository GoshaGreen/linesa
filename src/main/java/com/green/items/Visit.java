package com.green.items;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Gosha on 030 30.01.18.
 */
public class Visit {
    @Id
    @GeneratedValue
    int idVisit;
    Doctor doctor;
    Patient patient;
    String text;

    public Visit() {
    }

    public Visit(String text) {
        this.text = text;
    }

    public int getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(int idVisit) {
        this.idVisit = idVisit;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
