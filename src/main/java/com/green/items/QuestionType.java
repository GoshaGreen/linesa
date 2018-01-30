package com.green.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
public class QuestionType {
    @Id
    @GeneratedValue
    int id;
    String type;

    public QuestionType() {
    }

    public QuestionType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
