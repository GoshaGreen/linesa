package com.green.controller;

import com.green.service.AnswerService;
import com.green.item.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gosha on 001 01.02.18.
 */
@RestController
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @RequestMapping(method = RequestMethod.GET, value = "/Answer")
    public Answer answer(@RequestParam(value="id") int id){
        return answerService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/Answer")
    public void createAnswer(@RequestParam(value="answer") Answer answer){
        answerService.create(answer);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Answer")
    public void deleteAnswer(@RequestParam(value="id") int id){
        answerService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Answer")
    public void editAnswer(@RequestParam(value="answer") Answer answer){
        answerService.editAnswer(answer);
    }
}
