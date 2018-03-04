package com.green.service;


import com.green.item.Answer;
import com.green.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    @PostConstruct
    public void init() {

    }

    public Answer create(Answer answer){
        return answerRepository.save(answer);
    }

    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    public Answer getOne(int id){
        return answerRepository.getOne(id);
    }

    public Answer findById (int id){
        List<Answer> answers = answerRepository.findAll();
        for (Answer answer: answers) {if(answer.getIdAnswer()==id){
            return answer;}
        }
        return null;
    }

    public void deleteById(int id){
        answerRepository.delete(id);
    }

    public Answer editAnswer(Answer answer){
        return answerRepository.saveAndFlush(answer);
    }
}