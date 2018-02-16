package com.green.controller;

import com.green.item.Visit;
import com.green.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/Visit")
public class VisitController {
    @Autowired
    private VisitService visitService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Visit> visit(){
        return visitService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Visit visitid(@PathVariable("id") int id){
        return visitService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Visit createVisit(@RequestBody Visit visit){
        return visitService.create(visit);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteVisit(@PathVariable("id") int id){
        visitService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public Visit updateVisit(@RequestBody Visit visit){return visitService.editVisit(visit);}
}
