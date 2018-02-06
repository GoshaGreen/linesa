package com.green.item;

import javax.persistence.*;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@Table(name = "answer_variant")
public class AnswerVariant {
    @Id
    @GeneratedValue
    private int idAnswerVariant;

    @ManyToOne
    @JoinColumn(name="id_question")
    private Question question;

    private String Variant;

    public AnswerVariant() {
    }

    public AnswerVariant(Question question, String variant) {
        this.question = question;
        Variant = variant;
    }

    public int getIdAnswerVariant() {
        return idAnswerVariant;
    }

    public void setIdAnswerVariant(int idAnswerVariant) {
        this.idAnswerVariant = idAnswerVariant;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getVariant() {
        return Variant;
    }

    public void setVariant(String variant) {
        Variant = variant;
    }
}
