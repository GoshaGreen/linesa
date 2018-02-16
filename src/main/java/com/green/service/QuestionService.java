package com.green.service;


import com.green.item.Question;
import com.green.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Transactional
    @PostConstruct
    public void init() {
        questionRepository.save(new Question());
    }

    public Question create(Question question){
        return questionRepository.save(question);
    }

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Question getOne(int id){
        return questionRepository.getOne(id);
    }

    public Question findById (int id){
        List<Question> questions = questionRepository.findAll();
        for (Question question: questions) {if(question.getIdQuestion()==id){
            return question;}
        }
        return null;
    }

    public void deleteById(int id){
        questionRepository.delete(id);
    }

    public Question editQuestion(Question question){
        return questionRepository.save(question);
    }
}