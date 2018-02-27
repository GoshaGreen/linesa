package com.green.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue
    private int idAnswer;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_question")
    private Question question;

    @JsonIgnore
    @OneToMany(mappedBy = "answer")
    private List<Response> responses;

    @JsonIgnore
    @OneToMany(mappedBy = "activatingVariant")
    private List<Question> questions;

    private String Variant;

    public Answer() {
    }

    public Answer(List<Response> responses, List<Question> questions, String variant) {
        /*this.responses = responses;
        this.questions = questions;*/
        Variant = variant;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getVariant() {
        return Variant;
    }

    public void setVariant(String variant) {
        Variant = variant;
    }
}
