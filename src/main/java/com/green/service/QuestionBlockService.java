package com.green.service;


import com.green.item.QuestionBlock;
import com.green.repository.QuestionBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class QuestionBlockService {
    @Autowired
    private QuestionBlockRepository questionBlockRepository;

    @Transactional
    @PostConstruct
    public void init() {
        questionBlockRepository.save(new QuestionBlock());
    }

    public QuestionBlock create(QuestionBlock questionBlock){
        return questionBlockRepository.save(questionBlock);
    }

    public List<QuestionBlock> findAll() {
        return questionBlockRepository.findAll();
    }

    public QuestionBlock getOne(int id){
        return questionBlockRepository.getOne(id);
    }

    public QuestionBlock findById (int id){
        List<QuestionBlock> questionBlocks = questionBlockRepository.findAll();
        for (QuestionBlock questionBlock: questionBlocks) {if(questionBlock.getIdQuestionBlock()==id){
            return questionBlock;}
        }
        return null;
    }

    public void deleteById(int id){
        questionBlockRepository.delete(id);
    }

    public QuestionBlock editQuestionBlock(QuestionBlock questionBlock){
        return questionBlockRepository.save(questionBlock);
    }
}