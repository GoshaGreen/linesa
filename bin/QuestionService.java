package com.green.Services;


import com.green.items.Patient;
import com.green.items.Question;
import com.green.repositories.QuestionRepository;
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

    public boolean create(Question question){
        questionRepository.save(question);
        questionRepository.flush();
        return true;
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
        List<Question> questions = questionRepository.findAll();
        for (Question question: questions) {if(question.getIdQuestion()==id){
            questionRepository.delete(id);}
        }
    }

    public void editQuestion(int id, String text){
        findById(id).setQuestionText(text);
        questionRepository.flush();
    }

}