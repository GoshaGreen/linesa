package com.green.controller;

import com.green.item.Question;
import com.green.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/Question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Question> question(){
        return questionService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Question questionid(@PathVariable("id") int id){
        return questionService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Question createQuestion(@RequestBody Question question){
        return questionService.create(question);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteQuestion(@PathVariable("id") int id){
        questionService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public Question updateQuestion(@RequestBody Question question){return questionService.editQuestion(question);}
}
