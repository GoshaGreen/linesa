package com.green.controller;

import com.green.item.Answer;
import com.green.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/Answer")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Answer> answer(){
        return answerService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Answer answerid(@PathVariable("id") int id){
        return answerService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Answer createAnswer(@RequestBody Answer answer){
        return answerService.create(answer);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteAnswer(@PathVariable("id") int id){
        answerService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public Answer updateAnswer(@RequestBody Answer answer){return answerService.editAnswer(answer);}
}
