package com.schedular.service;

import com.schedular.entity.Superclass;
import com.schedular.repository.SuperclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperService {

    @Autowired
    private SuperclassRepository superclassRepository;

    public void createActionDuration(Superclass superclass){
        superclassRepository.save(superclass);

    }

}
