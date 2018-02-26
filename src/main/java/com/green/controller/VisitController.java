package com.green.controller;

import com.green.item.ShortVisit;
import com.green.item.Visit;
import com.green.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/Short")
    public List<ShortVisit> shortVisit(){
/*        List<Visit> allVisit;
        List<ShortVisit> allShortVisit = new ArrayList<>();
        allVisit = visitService.findAll();
        for(Visit visit : allVisit ){
            allShortVisit.add(new ShortVisit(visit));
        }*/
        List<ShortVisit> zatuchka = new ArrayList<>();
        zatuchka.add(new ShortVisit(1, "Dr. Her V.S.", "Ivanov I.I.", "Didease diseasovich","20.02.2020" ));
        zatuchka.add(new ShortVisit(2, "Dr. Her V.S.", "Ivanov I.I.", "Didease diseasovich","20.02.2020" ));
        zatuchka.add(new ShortVisit(3, "Dr. Her V.S.", "Ivanov I.I.", "Didease diseasovich","20.02.2020" ));
        zatuchka.add(new ShortVisit(4, "Dr. Her V.S.", "Ivanov I.I.", "Didease diseasovich","20.02.2020" ));
        zatuchka.add(new ShortVisit(5, "Dr. Her V.S.", "Ivanov I.I.", "Didease diseasovich","20.02.2020" ));
        zatuchka.add(new ShortVisit(6, "Dr. Her V.S.", "Ivanov I.I.", "Didease diseasovich","20.02.2020" ));
        zatuchka.add(new ShortVisit(7, "Dr. Her V.S.", "Ivanov I.I.","Didease diseasovich", "20.02.2020" ));
        zatuchka.add(new ShortVisit(8, "Dr. Her V.S.", "Ivanov I.I.", "Didease diseasovich","20.02.2020" ));

        // return allShortVisit;
        return zatuchka;
    }
}
