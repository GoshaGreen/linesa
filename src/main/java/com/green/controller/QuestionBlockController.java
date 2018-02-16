package com.green.controller;

import com.green.item.QuestionBlock;
import com.green.service.QuestionBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/QuestionBlock")
public class QuestionBlockController {
    @Autowired
    private QuestionBlockService questionBlockService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<QuestionBlock> questionBlock(){
        return questionBlockService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public QuestionBlock questionBlockid(@PathVariable("id") int id){
        return questionBlockService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public QuestionBlock createQuestionBlock(@RequestBody QuestionBlock questionBlock){
        return questionBlockService.create(questionBlock);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteQuestionBlock(@PathVariable("id") int id){
        questionBlockService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public QuestionBlock updateQuestionBlock(@RequestBody QuestionBlock questionBlock){return questionBlockService.editQuestionBlock(questionBlock);}
}
