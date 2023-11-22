package com.cic.demojenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<Object> demo(){
        System.out.println("xyz");
        return new ResponseEntity<>("ok a zai", HttpStatus.OK);
    }
}
