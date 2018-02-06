package com.green.item;

import javax.persistence.*;

/**
 * Created by Gosha on 001 01.02.18.
 */
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue
    private int idAnswer;

    @ManyToOne
    @JoinColumn(name="id_visit")
    private Visit visit;

    @ManyToOne
    @JoinColumn(name="id_question")
    private Question question;

    public Answer() {
    }

    public Answer(Visit visit, Question question) {
        this.visit = visit;
        this.question = question;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
