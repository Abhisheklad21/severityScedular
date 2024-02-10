package com.schedular.repository;

import com.schedular.entity.Severity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeverityRepository extends JpaRepository<Severity, Long> {
}
