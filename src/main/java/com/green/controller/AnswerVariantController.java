package com.green.controller;

import com.green.service.AnswerVariantService;
import com.green.item.AnswerVariant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class AnswerVariantController {
    @Autowired
    AnswerVariantService answerVariantService;

    @GetMapping("/Answers")
    public List<AnswerVariant> answerVariants(){return answerVariantService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/AnswerVariantForQuestion")
    public List<AnswerVariant> answerVariantsForQuestion(@RequestParam(value="questionId") int id){
        return answerVariantService.findForQuestion(id);}

    @RequestMapping(method = RequestMethod.GET, value = "/AnswerVariant")
    public AnswerVariant answerVariant(@RequestParam(value="id") int id){
        return answerVariantService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/AnswerVariant")
    public void createAnswerVariant(@RequestParam(value="answerVariant") AnswerVariant answerVariant){
        answerVariantService.create(answerVariant);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/AnswerVariant")
    public void deleteAnswerVariant(@RequestParam(value="id") int id){
        answerVariantService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/AnswerVariant")
    public void editAnswerVariant(@RequestParam(value="answerVariant") AnswerVariant answerVariant){
        answerVariantService.editAnswerVariant(answerVariant);
    }

}
