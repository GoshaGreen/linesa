package com.green.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
public class Doctor {
    @Id
    @GeneratedValue
    int idDoctor;

    String FirstName;

    String MiddleName;

    String LastName;

    String Degree;

    String Position;

    public Doctor(){

    }

    public Doctor(String firstName, String middleName, String lastName, String degree, String position) {
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        Degree = degree;
        Position = position;
    }

    public Doctor(String firstName) {
        FirstName = firstName;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
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
