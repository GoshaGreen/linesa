package com.green.controllers;

import com.green.Services.DoctorService;
import com.green.items.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/Doctor")
    public List<Doctor> doctors(){return doctorService.findAll();}
}
