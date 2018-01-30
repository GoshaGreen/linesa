package com.green.controllers;

import com.green.Services.PatientService;
import com.green.items.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/Patient")
    public List<Patient> doctors(){return patientService.findAll();}

}
