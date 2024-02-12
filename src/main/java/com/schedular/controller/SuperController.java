package com.schedular.controller;


import com.schedular.entity.Superclass;
import com.schedular.service.SuperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/duration")
public class SuperController {

    @Autowired
    private SuperService superService;

    @PostMapping
    public void createActionduration(@RequestBody Superclass superclass){
        superService.createActionDuration(superclass);

    }



}
