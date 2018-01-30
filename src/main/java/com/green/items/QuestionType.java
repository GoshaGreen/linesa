package com.green.items;

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
    int idQuestionType;
    private String type;

    @OneToMany(mappedBy = "questionType")
    private List<Question> questionList;

    public QuestionType() {
    }

    public QuestionType(String type) {
        this.type = type;
    }

    public int getId() {
        return idQuestionType;
    }

    public void setId(int id) {
        this.idQuestionType = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
