package com.green.items;

import javax.persistence.*;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@Table(name = "answer_variant")
public class AnswerVariant {
    @Id
    @GeneratedValue
    int idAnswerVariant;
    @ManyToOne
    @JoinColumn(name="id_question")
    private Question question;

    private String Variant;

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
