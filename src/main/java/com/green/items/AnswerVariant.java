package com.green.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
public class AnswerVariant {
    @Id
    @GeneratedValue
    int idAnswerVariant;
    String Variant;

    public AnswerVariant() {
    }

    public AnswerVariant(String variant) {
        Variant = variant;
    }

    public int getIdAnswerVariant() {
        return idAnswerVariant;
    }

    public void setIdAnswerVariant(int idAnswerVariant) {
        this.idAnswerVariant = idAnswerVariant;
    }

    public String getVariant() {
        return Variant;
    }

    public void setVariant(String variant) {
        Variant = variant;
    }
}
