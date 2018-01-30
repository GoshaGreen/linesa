package com.green.Services;


import com.green.items.AnswerVariant;
import com.green.items.Patient;
import com.green.repositories.AnswerVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class AnswerVariantService {
    @Autowired
    private AnswerVariantRepository answerVariantRepository;

    @Transactional
    @PostConstruct
    public void init() {
    }

    public boolean create(AnswerVariant answerVariant){
        answerVariantRepository.save(answerVariant);
        answerVariantRepository.flush();
        return true;
    }

    public List<AnswerVariant> findAll() {
        return answerVariantRepository.findAll();
    }

    public AnswerVariant getOne(int id){
        return answerVariantRepository.getOne(id);
    }

    public AnswerVariant findById (int id){
        List<AnswerVariant> answerVariants = answerVariantRepository.findAll();
        for (AnswerVariant answerVariant: answerVariants) {if(answerVariant.getIdAnswerVariant()==id){
            return answerVariant;}
        }
        return null;
    }

    public void deleteById(int id){
        List<AnswerVariant> answerVariants = answerVariantRepository.findAll();
        for (AnswerVariant answerVariant: answerVariants) {if(answerVariant.getIdAnswerVariant()==id){
            answerVariantRepository.delete(id);}
        }
    }

    public void editAnswerVariant(int id, String text){
        findById(id).setVariant(text);
        answerVariantRepository.flush();
    }

}