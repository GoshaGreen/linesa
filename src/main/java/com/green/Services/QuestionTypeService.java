package com.green.Services;


import com.green.items.Question;
import com.green.items.QuestionType;
import com.green.repositories.QuestionRepository;
import com.green.repositories.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class QuestionTypeService {
    @Autowired
    private QuestionTypeRepository questionTypeRepository;

    @Transactional
    @PostConstruct
    public void init() {
    }

    public boolean create(QuestionType questionType){
        questionTypeRepository.save(questionType);
        questionTypeRepository.flush();
        return true;
    }

    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }

    public QuestionType getOne(int id){
        return questionTypeRepository.getOne(id);
    }

    public QuestionType findById (int id){
        List<QuestionType> questionTypes = questionTypeRepository.findAll();
        for (QuestionType questionType: questionTypes) {if(questionType.getId()==id){
            return questionType;}
        }
        return null;
    }

    public void deleteById(int id){
        List<QuestionType> questionTypes = questionTypeRepository.findAll();
        for (QuestionType questionType: questionTypes) {if(questionType.getId()==id){
            questionTypeRepository.delete(id);}
        }
    }

    public void editQuestionType(int id, String text){
        findById(id).setType(text);
        questionTypeRepository.flush();
    }

}