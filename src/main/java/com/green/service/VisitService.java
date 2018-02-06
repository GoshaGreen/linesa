package com.green.service;


import com.green.item.Visit;
import com.green.repositorie.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class VisitService {
    @Autowired
    private VisitRepository visitRepository;

    @Transactional
    @PostConstruct
    public void init() {
        visitRepository.save(new Visit());
    }

    public boolean create(Visit visit){
        visitRepository.save(visit);
        visitRepository.flush();
        return true;
    }

    public List<Visit> findAll() {
        return visitRepository.findAll();
    }

    public Visit getOne(int id){
        return visitRepository.getOne(id);
    }

    public Visit findById (int id){
        List<Visit> visits = visitRepository.findAll();
        for (Visit visit: visits) {if(visit.getIdVisit()==id){
            return visit;}
        }
        return null;
    }

    public void deleteById(int id){
        List<Visit> visits = visitRepository.findAll();
        for (Visit visit: visits) {if(visit.getIdVisit()==id){
            visitRepository.delete(id);}
        }
    }

    public void editVisit(Visit visit){
        this.deleteById(visit.getIdVisit());
        visitRepository.save(visit);
        visitRepository.flush();
    }

}