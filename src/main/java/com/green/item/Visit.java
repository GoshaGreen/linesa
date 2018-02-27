package com.green.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    private int idVisit;

    @ManyToOne
    @JoinColumn(name="id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="id_patient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "id_questionnaire")
    private Questionnaire questionnaire;

    @OneToMany(mappedBy = "visit")
    private List<Response> responses;

    private Date date;

    public Visit() {
    }

    public String getMainDisease() {

        return "DESIzE: REpair ThiZ MeZod";
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
}


