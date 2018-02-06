package com.green.item;

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
    private int idQuestion;

    @ManyToOne
    @JoinColumn(name="id_question_type")
    private QuestionType questionType;

    @OneToMany(mappedBy = "question")
    private List<AnswerVariant> answerVariantList;

    private String questionText;

    public Question() {
    }

    public Question(QuestionType questionType, List<AnswerVariant> answerVariantList, String questionText) {
        this.questionType = questionType;
        this.answerVariantList = answerVariantList;
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
