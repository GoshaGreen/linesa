package com.green.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Gosha on 001 01.02.18.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue
    private int idResponse;

    @ManyToOne
    @JoinColumn(name="id_answer")
    private Answer answer;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="id_visit")
    private Visit visit;

    @ManyToOne
    @JoinColumn(name="id_question")
    private Question question;

    private String textAnswer;
    private String dateAnswer;

    public Response() {
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getIdResponse() {
        return idResponse;
    }

    public void setIdResponse(int idResponse) {
        this.idResponse = idResponse;
    }

    /*public String getAnswer() {
        return answer == null ? "" : Integer.toString(answer.getIdAnswer());
    }*/

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

    public void setVisitID(int id) {
        this.visit = new Visit(id);
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

    public String toString() {
        return "Response{" +
                "idResponse=" + idResponse +
                ", answer=" + answer +
                ", visit=" + visit +
                ", question=" + question +
                ", textAnswer='" + textAnswer + '\'' +
                ", dateAnswer='" + dateAnswer + '\'' +
                '}';
    }
}
