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
        doctorRepository.save(new Doctor( "DoctorA"));
        doctorRepository.save(new Doctor("DoctorB"));
        doctorRepository.save(new Doctor("DoctorC"));
    }
    public List<Doctor> findAll() {return doctorRepository.findAll(); }

}
