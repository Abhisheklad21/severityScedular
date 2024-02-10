package com.schedular.service;

import com.schedular.entity.Severity;
import com.schedular.repository.SeverityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class SeverityService {

    @Autowired
    private SeverityRepository severityRepository;

    @Async
    public void createSeverity(Severity severity) {
        Severity save = severityRepository.save(severity);
        startCountdown(severity);

    }

    private void startCountdown(Severity severity) {
        Duration duration = severity.getDuration();
        try {
            Thread.sleep(duration.toMillis()); // Sleep for the duration
            System.out.println("Your duration was finished: " + severity.getLocationName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Countdown interrupted for location: " + severity.getLocationName());
        }
    }
}
