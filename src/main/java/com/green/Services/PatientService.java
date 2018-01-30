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
        patientRepository.save(new Patient("PatientA"));
        patientRepository.save(new Patient("PatientB"));
        patientRepository.save(new Patient("PatientC"));
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}