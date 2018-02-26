package com.green.service;


import com.green.item.Questionnaire;
import com.green.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class QuestionnaireService {
    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    @Transactional
    @PostConstruct
    public void init() {
    }

    public Questionnaire create(Questionnaire questionnaire){
        return questionnaireRepository.save(questionnaire);
    }

    public List<Questionnaire> findAll() {
        return questionnaireRepository.findAll();
    }

    public Questionnaire getOne(int id){
        return questionnaireRepository.getOne(id);
    }

    public Questionnaire findById (int id){
        List<Questionnaire> questionnaires = questionnaireRepository.findAll();
        for (Questionnaire questionnaire: questionnaires) {if(questionnaire.getIdQuestionnaire()==id){
            return questionnaire;}
        }
        return null;
    }

    public void deleteById(int id){
        questionnaireRepository.delete(id);
    }

    public Questionnaire editQuestionnaire(Questionnaire questionnaire){
        return questionnaireRepository.save(questionnaire);
    }
}