package com.green.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gosha on 015 15.02.18.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "questionnaires")
public class Questionnaire {
    @Id
    @GeneratedValue
    private int idQuestionnaire;

    @OneToMany(mappedBy = "questionnaire")
    private List<QuestionBlock> questionBlocks;

/*    @OneToMany(mappedBy = "questionnaire")
    private List<Visit> visits;*/

    private String name;

    public Questionnaire() {
    }

    public Questionnaire(List<QuestionBlock> questionBlocks, List<Visit> visits, String name) {
         this.name = name;
    }

    public String toOrdinaryString() {
        return "Questionnaire{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", name='" + name + '\'' +
                '}';
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public List<QuestionBlock> getQuestionBlocks() {
        return questionBlocks;
    }

    public void setQuestionBlocks(List<QuestionBlock> questionBlocks) {
        this.questionBlocks = questionBlocks;
    }

   /* public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
