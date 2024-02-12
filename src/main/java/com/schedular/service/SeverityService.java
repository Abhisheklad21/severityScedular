package com.schedular.service;

import com.schedular.entity.Severity;
import com.schedular.entity.Superclass;
import com.schedular.repository.SeverityRepository;
import com.schedular.repository.SuperclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Optional;

@Service
public class SeverityService {

    @Autowired
    private SuperclassRepository superclassRepository;
    @Autowired
    private SeverityRepository severityRepository;

    @Async
    public void createSeverity(Severity severity) {
        Severity save = severityRepository.save(severity);
        startCountdown(severity);

    }

    public void startCountdown(Severity severity) {
        Optional<Superclass> ActionSuperclassObject = superclassRepository.findByAction(severity.getAction());
        Duration duration = ActionSuperclassObject.get().getDuration();

        try {
            Thread.sleep(duration.toMillis()); // Sleep for the duration
            System.out.println("Your duration was finished: " + severity.getLocationName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Countdown interrupted for location: " + severity.getLocationName());
        }
    }
}
