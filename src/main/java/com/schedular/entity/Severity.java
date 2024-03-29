package com.schedular.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.Duration;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Severity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String locationName;
    private String action;



}
