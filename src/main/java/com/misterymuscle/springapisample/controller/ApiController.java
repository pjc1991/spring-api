package com.misterymuscle.springapisample.controller;

\
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
//@RequiredArgsConstructor
public class ApiController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public String createItem(String testInput){
        return testInput;
    }
    
}
