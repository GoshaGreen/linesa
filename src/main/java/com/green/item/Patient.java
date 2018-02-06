package com.green.item;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue
    private int idPatient;
    @OneToMany(mappedBy = "patient")
    private List<Visit> visits;

    private String firstName;

    private  String middleName;

    private String lastName;

    private Date birthDate;

    public Patient() {
    }

    public Patient(List<Visit> visits, String firstName, String middleName, String lastName, Date birthDate) {
        this.visits = visits;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}