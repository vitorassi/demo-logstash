package com.anderson.demologstash.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLog {

    private Logger log = LoggerFactory.getLogger(ControllerLog.class.getName());

    @GetMapping("/log")
    ResponseEntity<String> get (){
        log.info("Get -- LOG");
        return ResponseEntity.ok("ok");
    }

    @PostMapping(value = "/log", consumes = "application/json")
    ResponseEntity<String> post (@RequestBody String jsonObject){
        log.info("POST -- LOG ---  " + jsonObject);
        return ResponseEntity.ok(jsonObject);
    }

}
