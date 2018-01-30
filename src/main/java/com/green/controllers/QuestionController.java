package com.green.controllers;

import com.green.Services.AnswerVariantService;
import com.green.Services.QuestionService;
import com.green.items.AnswerVariant;
import com.green.items.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/Questions")
    public List<Question> patients(){return questionService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/Question")
    public Question patient(@RequestParam(value="id") int id){
        return questionService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/Question")
    public void createQuestion(@RequestParam(value="text") String text){
        questionService.create(new Question(text));
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Question")
    public void deleteQuestion(@RequestParam(value="id") int id){
        questionService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Question")
    public void editQuestion(@RequestParam(value="id") int id,@RequestParam(value="text") String name){
        questionService.editQuestion(id,name);
    }

}
