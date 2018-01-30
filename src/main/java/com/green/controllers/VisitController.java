package com.green.controllers;

import com.green.Services.QuestionService;
import com.green.Services.VisitService;
import com.green.items.Question;
import com.green.items.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class VisitController {
    @Autowired
    VisitService visitService;

    @GetMapping("/Visits")
    public List<Visit> patients(){return visitService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/Visit")
    public Visit visit(@RequestParam(value="id") int id){
        return visitService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/Visit")
    public void createVisit(@RequestParam(value="text") String text){
        visitService.create(new Visit(text));
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Visit")
    public void deleteVisit(@RequestParam(value="id") int id){
        visitService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Visit")
    public void editVisit(@RequestParam(value="id") int id,@RequestParam(value="text") String name){
        visitService.editVisit(id,name);
    }

}
