package com.green.Services;


import com.green.items.Patient;
import com.green.repositories.PatientRepository;
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

    public boolean create(Patient patient){
        patientRepository.save(patient);
        patientRepository.flush();
        return true;
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
            System.out.println(patient.toString2());
            return patient;}
        }
        return null;
    }

    public void deleteById(int id){
        List<Patient> patients = patientRepository.findAll();
        for (Patient patient: patients) {if(patient.getIdPatient()==id){patientRepository.delete(id);}
        }
    }

    public void editPatient(int id, String name){
        findById(id).setMiddleName(name);
        patientRepository.flush();
    }

}