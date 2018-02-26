package com.green.service;


import com.green.item.Response;
import com.green.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
@Service
public class ResponseService {
    @Autowired
    private ResponseRepository responseRepository;

    @Transactional
    @PostConstruct
    public void init() {
    }

    public Response create(Response response){
        return responseRepository.save(response);
    }

    public List<Response> findAll() {
        return responseRepository.findAll();
    }

    public Response getOne(int id){
        return responseRepository.getOne(id);
    }

    public Response findById (int id){
        List<Response> responses = responseRepository.findAll();
        for (Response response: responses) {if(response.getIdResponse()==id){
            return response;}
        }
        return null;
    }

    public void deleteById(int id){
        responseRepository.delete(id);
    }

    public Response editResponse(Response response){
        return responseRepository.save(response);
    }
}