package com.green.controllers;

import com.green.Services.QuestionService;
import com.green.Services.QuestionTypeService;
import com.green.items.Question;
import com.green.items.QuestionType;
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
    public List<QuestionType> patients(){return questionTypeService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/QuestionType")
    public QuestionType patient(@RequestParam(value="id") int id){
        return questionTypeService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/QuestionType")
    public void createQuestionType(@RequestParam(value="text") String text){
        questionTypeService.create(new QuestionType(text));
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/QuestionType")
    public void deleteQuestionType(@RequestParam(value="id") int id){
        questionTypeService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/QuestionType")
    public void editQuestionType(@RequestParam(value="id") int id,@RequestParam(value="text") String name){
        questionTypeService.editQuestionType(id,name);
    }

}
