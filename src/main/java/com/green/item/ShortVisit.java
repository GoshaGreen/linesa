package com.green.item;

import java.sql.Date;

/**
 * Created by Gosha on 020 20.02.18.
 */
public class ShortVisit {
    private int idVisit;

    private String doctor;

    private String patient;

    private String mainDesease;

    private String date;

    public ShortVisit() {
    }

    public ShortVisit(int idVisit, String doctor, String patient, String mainDesease, String date) {
        this.idVisit = idVisit;
        this.doctor = doctor;
        this.patient = patient;
        this.mainDesease = mainDesease;
        this.date = date;
    }

    public ShortVisit(Visit visit) {
        this.idVisit = visit.getIdVisit();
        this.doctor = visit.getDoctor().toOrdinaryString();
        this.patient = visit.getPatient().toOrdinaryString();
        this.mainDesease = visit.getMainDisease();
        this.date = visit.getDate().toString();
    }

    public int getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(int idVisit) {
        this.idVisit = idVisit;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMainDesease() {
        return mainDesease;
    }

    public void setMainDesease(String mainDesease) {
        this.mainDesease = mainDesease;
    }
}
