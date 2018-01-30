package com.green.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Entity
public class Question {
    @Id
    @GeneratedValue
    int idQuestion;
    QuestionType questionType;
    List<AnswerVariant> answerVariantList;
    String questionText;

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

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public List<AnswerVariant> getAnswerVariantList() {
        return answerVariantList;
    }

    public void setAnswerVariantList(List<AnswerVariant> answerVariantList) {
        this.answerVariantList = answerVariantList;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

}
