package com.green.item;

import javax.persistence.*;

/**
 * Created by Gosha on 001 01.02.18.
 */
@Entity
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue
    private int idResponse;

    @ManyToOne
    @JoinColumn(name="id_answer")
    private Answer answer;

    @ManyToOne
    @JoinColumn(name="id_visit")
    private Visit visit;

    private String textAnswer;
    private String dateAnswer;

    public Response() {
    }

    public int getIdResponse() {
        return idResponse;
    }

    public void setIdResponse(int idResponse) {
        this.idResponse = idResponse;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    public String getDateAnswer() {
        return dateAnswer;
    }

    public void setDateAnswer(String dateAnswer) {
        this.dateAnswer = dateAnswer;
    }
}
