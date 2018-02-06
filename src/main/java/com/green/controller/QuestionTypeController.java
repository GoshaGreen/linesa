package com.green.controller;

import com.green.service.QuestionTypeService;
import com.green.item.QuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class QuestionTypeController {
    @Autowired
    QuestionTypeService questionTypeService;

    @GetMapping("/QuestionTypes")
    public List<QuestionType> questionTypes(){return questionTypeService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/QuestionType")
    public QuestionType questionType(@RequestParam(value="id") int id){
        return questionTypeService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/QuestionType")
    public void createQuestionType(@RequestParam(value="questionType") QuestionType questionType){
        questionTypeService.create(questionType);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/QuestionType")
    public void deleteQuestionType(@RequestParam(value="id") int id){
        questionTypeService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/QuestionType")
    public void editQuestionType(@RequestParam(value="questionType") QuestionType questionType){
        questionTypeService.editQuestionType(questionType);
    }

}
