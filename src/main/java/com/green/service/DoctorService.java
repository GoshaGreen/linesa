package com.green.Services;

import com.green.items.Doctor;
import com.green.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Transactional
    @PostConstruct
    public void init(){
    }

    public boolean create(Doctor doctor){
        doctorRepository.save(doctor);
        doctorRepository.flush();
        return true;
    }

    public List<Doctor> findAll() {return doctorRepository.findAll(); }

    public Doctor getOne(int id){return doctorRepository.getOne(id);}

    public Doctor findById (int id){
        List<Doctor> doctors = doctorRepository.findAll();
        for (Doctor doctor: doctors) {if(doctor.getIdDoctor()==id){
            return doctor;}
        }
        return null;
    }

    public void deleteById(int id){
        List<Doctor> doctors = doctorRepository.findAll();
        for (Doctor doctor: doctors) {if(doctor.getIdDoctor()==id){doctorRepository.delete(id);}
        }
    }

    public void editDoctor(Doctor doctor){
        this.deleteById(doctor.getIdDoctor());
        doctorRepository.save(doctor);
        doctorRepository.flush();
    }

}
