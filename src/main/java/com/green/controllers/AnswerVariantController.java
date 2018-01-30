package com.green.controllers;

import com.green.Services.AnswerVariantService;
import com.green.Services.PatientService;
import com.green.items.AnswerVariant;
import com.green.items.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class AnswerVariantController {
    @Autowired
    AnswerVariantService answerVariantService;

    @GetMapping("/Answers")
    public List<AnswerVariant> patients(){return answerVariantService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/Answer")
    public AnswerVariant patient(@RequestParam(value="id") int id){
        return answerVariantService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/Answer")
    public void createPatient(@RequestParam(value="text") String name){
        answerVariantService.create(new AnswerVariant(name));
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Answer")
    public void deletePatient(@RequestParam(value="id") int id){
        answerVariantService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Answer")
    public void editPatient(@RequestParam(value="id") int id,@RequestParam(value="text") String name){
        answerVariantService.editAnswerVariant(id,name);
    }

}
