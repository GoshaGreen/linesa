package com.green.controller;

import com.green.service.PatientService;
import com.green.item.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/Patients")
    public List<Patient> patients(){return patientService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/Patient")
    public Patient patient(@RequestParam(value="id") int id){
        return patientService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/Patient")
    public void createPatient(@RequestParam(value="patient") Patient patient){
        patientService.create(patient);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Patient")
    public void deletePatient(@RequestParam(value="id") int id){
        patientService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Patient")
    public void editPatient(@RequestParam(value="patient") Patient patient){
        patientService.editPatient(patient);
    }

}
