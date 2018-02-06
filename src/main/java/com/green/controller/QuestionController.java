package com.green.controller;

import com.green.service.QuestionService;
import com.green.item.Question;
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
    public List<Question> questions(){return questionService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/Question")
    public Question question(@RequestParam(value="id") int id){
        return questionService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/Question")
    public void createQuestion(@RequestParam(value="question") Question question){
        questionService.create(question);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Question")
    public void deleteQuestion(@RequestParam(value="id") int id){
        questionService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Question")
    public void editQuestion(@RequestParam(value="question") Question question){
        questionService.editQuestion(question);
    }

}
