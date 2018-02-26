package com.green.controller;

import com.green.item.Questionnaire;
import com.green.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/Questionnaire")
public class QuestionnaireController {
    @Autowired
    private QuestionnaireService questionnaireService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Questionnaire> questionnaire(){
        return questionnaireService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Questionnaire questionnaireid(@PathVariable("id") int id){
        System.out.println(questionnaireService.findById(id).toOrdinaryString());
        return questionnaireService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Questionnaire createQuestionnaire(@RequestBody Questionnaire questionnaire){
        return questionnaireService.create(questionnaire);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteQuestionnaire(@PathVariable("id") int id){
        questionnaireService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public Questionnaire updateQuestionnaire(@RequestBody Questionnaire questionnaire){return questionnaireService.editQuestionnaire(questionnaire);}
}
