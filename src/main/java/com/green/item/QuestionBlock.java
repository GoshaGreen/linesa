package com.green.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gosha on 015 15.02.18.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "question_blocks")
public class QuestionBlock {
    @Id
    @GeneratedValue
    private int idQuestionBlock;

    @OneToMany(mappedBy = "questionBlock")
    private List<Question> questions;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_questionnaire")
    private Questionnaire questionnaire;

    private String questionBlockText;

    public QuestionBlock() {
    }

    public QuestionBlock(List<Question> questions, Questionnaire questionnaire, String questionBlockText) {
/*      this.questionnaire = questionnaire;*/
        this.questionBlockText = questionBlockText;
    }

    public int getIdQuestionBlock() {
        return idQuestionBlock;
    }

    public void setIdQuestionBlock(int idQuestionBlock) {
        this.idQuestionBlock = idQuestionBlock;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public String getQuestionBlockText() {
        return questionBlockText;
    }

    public void setQuestionBlockText(String questionBlockText) {
        this.questionBlockText = questionBlockText;
    }
}
