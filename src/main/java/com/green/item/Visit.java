package com.green.item;

import javax.persistence.*;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@Table(name = "visit")
public class Visit {
    @Id
    @GeneratedValue
    private int idVisit;

    @ManyToOne
    @JoinColumn(name="id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="id_patient")
    private Patient patient;

    String text;

    public Visit() {
    }

    public Visit(Doctor doctor, Patient patient, String text) {
        this.doctor = doctor;
        this.patient = patient;
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
