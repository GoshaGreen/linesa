package com.green.item;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@Table(name="question_type")
public class QuestionType {
    @Id
    @GeneratedValue
    private int idQuestionType;

    private String type;

    @OneToMany(mappedBy = "questionType")
    private List<Question> questionList;

    public QuestionType() {
    }

    public QuestionType(String type, List<Question> questionList) {
        this.type = type;
        this.questionList = questionList;
    }

    public int getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(int idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}

