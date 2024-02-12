package com.schedular.repository;

import com.schedular.entity.Severity;
import com.schedular.entity.Superclass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SuperclassRepository extends JpaRepository<Superclass, Long> {
    Optional<Superclass> findByAction(String action);
}
