package com.schedular.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Superclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String action;
    private Duration duration;


}
