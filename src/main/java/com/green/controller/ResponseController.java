package com.green.controller;

import com.green.item.Response;
import com.green.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gosha on 016 16.02.18.
 */
@RestController
@RequestMapping(value="/Response")
public class ResponseController {
    @Autowired
    private ResponseService responseService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Response> response(){
        return responseService.findAll();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Response responseid(@PathVariable("id") int id){
        return responseService.findById(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value="/{id}")
    public Response createResponseWI(@RequestBody Response response, @PathVariable("id") int id){
        response.setVisitID(id);
        return responseService.create(response);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public Response createResponse(@RequestBody Response response) {
        return responseService.create(response);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void deleteResponse(@PathVariable("id") int id){
        responseService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public Response updateResponse(@RequestBody Response response){return responseService.editResponse(response);}

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/del/{id}")
    public void deletByVisit(@PathVariable("id") int id) {
        responseService.deleteBYVisit(id);
    }
}
