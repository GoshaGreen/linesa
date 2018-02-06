package com.green.item;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue
    private int idDoctor;
    @OneToMany(mappedBy = "doctor")
    private List<Visit> visits;

    private String FirstName;

    private String MiddleName;

    private  String LastName;

    private String Degree;

    private String Position;

    public Doctor(){

    }

    public Doctor(String firstName, String middleName, String lastName, String degree, String position) {
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        Degree = degree;
        Position = position;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
