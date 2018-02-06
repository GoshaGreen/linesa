package com.green.controller;

import com.green.service.DoctorService;
import com.green.item.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/Doctors")
    public List<Doctor> doctors(){return doctorService.findAll();}

    @RequestMapping(method = RequestMethod.GET, value = "/Doctor")
    public Doctor doctor(@RequestParam(value="id") int id){
        return doctorService.findById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/Doctor")
    public void createDoctor(@RequestParam(value="patient") Doctor doctor){doctorService.create(doctor);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Doctor")
    public void deleteDoctor(@RequestParam(value="id") int id){
        doctorService.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Doctor")
    public void editDoctor(@RequestParam(value="patient") Doctor doctor){
        doctorService.editDoctor(doctor);
    }

}
