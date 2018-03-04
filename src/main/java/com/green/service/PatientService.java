package com.green.service;


import com.green.item.Patient;
import com.green.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    @PostConstruct
    public void init() {
    }

    public Patient create(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public Patient getOne(int id){
        return patientRepository.getOne(id);
    }

    public Patient findById (int id){
        List<Patient> patients = patientRepository.findAll();
        for (Patient patient: patients) {if(patient.getIdPatient()==id){
            return patient;}
        }
        return null;
    }

    public void deleteById(int id){
        patientRepository.delete(id);
    }

    public Patient editPatient(Patient patient){
        return patientRepository.saveAndFlush(patient);
    }
}