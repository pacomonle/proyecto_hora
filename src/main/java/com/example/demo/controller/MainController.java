package com.example.demo.controller;

import com.example.demo.service.TimeServiceImpl;
import com.example.demo.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * MainController
 */

@Controller
public class MainController {

    @Autowired
    private TimeService ts;
    
    @GetMapping ("/time")
    @ResponseBody
    public String time() {
        
        return ts.getTiempo();

    }

}