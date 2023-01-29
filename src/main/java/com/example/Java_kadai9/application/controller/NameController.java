package com.example.Java_kadai9.application.controller;

import com.example.Java_kadai9.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public  class NameController {
    private final NameService nameService;

    public  NameController(NameService nameService){
        this.nameService = nameService;
    }
    @GetMapping("/names")
    public <NameResponse> List<NameResponse> getNames(){
        return (List<NameResponse>) nameService.findAll();
    }
}