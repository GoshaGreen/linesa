package com.green.controller;

import com.green.item.Patient;
import com.green.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/Patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Patient> patient(){
        return patientService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Patient patientid(@PathVariable("id") int id){
        return patientService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Patient createPatient(@RequestBody Patient patient){
        return patientService.create(patient);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deletePatient(@PathVariable("id") int id){
        patientService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public Patient updatePatient(@RequestBody Patient patient){return patientService.editPatient(patient);}
}
