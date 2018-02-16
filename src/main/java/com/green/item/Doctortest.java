package com.green.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gosha on 015 15.02.18.
 */
@Entity
@Table(name = "doctortest")
public class Doctortest {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Doctortest() {
    }

    @Override
    public String toString() {
        return "Doctortest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
