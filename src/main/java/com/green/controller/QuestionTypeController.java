package com.green.controller;

import com.green.item.QuestionType;
import com.green.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/QuestionType")
public class QuestionTypeController {
    @Autowired
    private QuestionTypeService questionTypeService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<QuestionType> questionType(){
        return questionTypeService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public QuestionType questionTypeid(@PathVariable("id") int id){
        return questionTypeService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public QuestionType createQuestionType(@RequestBody QuestionType questionType){
        return questionTypeService.create(questionType);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteQuestionType(@PathVariable("id") int id){
        questionTypeService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public QuestionType updateQuestionType(@RequestBody QuestionType questionType){return questionTypeService.editQuestionType(questionType);}
}
