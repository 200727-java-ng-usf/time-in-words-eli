package com.revature.controllers;

import com.revature.models.TimeModel;
import com.revature.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/events")
public class Controller {

    @Autowired
    private TimeService timeService;

    public Controller(TimeService timeService){
        this.timeService = timeService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TimeModel> getAll(){
        return timeService.findAll();

    }

}
