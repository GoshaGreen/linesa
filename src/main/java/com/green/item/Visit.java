package com.green.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "visits")
public class Visit {
    @Id
    @GeneratedValue
    @JsonView(Visit.class)
    private int idVisit;

    @ManyToOne
    @JoinColumn(name="id_doctor")
    private Doctor doctor;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="id_patient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "id_questionnaire")
    private Questionnaire questionnaire;

    @OneToMany(mappedBy = "visit", cascade = {CascadeType.ALL})
    private List<Response> responses;

    @JsonView(Visit.class)
    private String MainDisease;

    @JsonView(Visit.class)
    private Date date;

    @JsonView(Visit.class)
    public String patientName() {
        return patient == null ? "" : patient.getFirstName().substring(0,1) + ". " +
                patient.getMiddleName().substring(0,1) + ". " +
                patient.getLastName();
    }


    @JsonView(Visit.class)
    public String doctorName() {
        return doctor == null ? "" : doctor.getFirstName().substring(0,1) + ". " +
                doctor.getMiddleName().substring(0,1) + ". " +
                doctor.getLastName();
    }

    public Visit() {
    }

    public Visit(int id) {
        this.idVisit = id;
    }

    public String getMainDisease() {
        return MainDisease;
    }

    public void setMainDisease(String mainDisease) {
        MainDisease = mainDisease;
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

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toOrdinaryString() {
        return "Visit{" +
                "idVisit=" + idVisit +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", questionnaire=" + questionnaire +
                ", responses=" + responses +
                ", MainDisease='" + MainDisease + '\'' +
                ", date=" + date +
                '}';
    }
}


