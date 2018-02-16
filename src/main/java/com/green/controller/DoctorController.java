package com.green.controller;

import com.green.item.Doctor;
import com.green.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/Doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Doctor> doctor(){
        return doctorService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Doctor doctorid(@PathVariable("id") int id){
        return doctorService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorService.create(doctor);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteDoctor(@PathVariable("id") int id){
        doctorService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public Doctor updateDoctor(@RequestBody Doctor doctor){return doctorService.editDoctor(doctor);}
}
