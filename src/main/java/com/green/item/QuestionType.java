package com.green.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="question_types")
public class QuestionType {
    @Id
    @GeneratedValue
    private int idQuestionType;

    /*@OneToMany(mappedBy = "questionType")
    private List<Question> questions;*/

    private String type;

    public QuestionType() {
    }

    public int getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(int idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

/*    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

