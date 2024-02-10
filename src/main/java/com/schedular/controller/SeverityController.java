package com.schedular.controller;


import com.schedular.entity.Severity;
import com.schedular.service.SeverityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/severity")
public class SeverityController {

    @Autowired
    private SeverityService severityService;
    @PostMapping
    public ResponseEntity<?> createSeverity(@RequestBody Severity severity){
     severityService.createSeverity(severity);
        return new ResponseEntity<>("Severity Created", HttpStatus.CREATED);
    }

}
