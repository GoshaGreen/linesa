package com.green.items;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue
    int idQuestion;

    @ManyToOne
    @JoinColumn(name="id_question_type")
    private QuestionType questionType;

    @OneToMany(mappedBy = "question")
    private List<AnswerVariant> answerVariantList;


    private String questionText;

    public Question() {
    }

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public List<AnswerVariant> getAnswerVariantList() {
        return answerVariantList;
    }

    public void setAnswerVariantList(List<AnswerVariant> answerVariantList) {
        this.answerVariantList = answerVariantList;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

}
