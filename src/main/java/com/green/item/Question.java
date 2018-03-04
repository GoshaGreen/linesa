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
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue
    private int idQuestion;

    @ManyToOne
    @JoinColumn(name="id_question_type")
    private QuestionType questionType;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_question_block")
    private QuestionBlock questionBlock;

    @ManyToOne
    @JoinColumn(name="id_answer")
    private Answer activatingVariant;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @JsonIgnore
    @OneToMany(mappedBy = "question")
    private List<Response> response;

    private String questionText;

    private boolean mandatory;

    public Question() {
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public QuestionBlock getQuestionBlock() {
        return questionBlock;
    }

    public void setQuestionBlock(QuestionBlock questionBlock) {
        this.questionBlock = questionBlock;
    }

    public Answer getActivatingVariant() {
        return activatingVariant;
    }

    public void setActivatingVariant(Answer activatingVariant) {
        this.activatingVariant = activatingVariant;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
}
