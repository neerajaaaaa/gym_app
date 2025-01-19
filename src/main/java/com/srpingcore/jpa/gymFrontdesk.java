package com.srpingcore.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class gymFrontdesk {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int staff_id;
    private String name;
    private String email;
    private String role;
    @Column(name = "phone_number", nullable = false)
    private int phone_number;
    private Timestamp hire_date;
    //@Transient
    //@Jsonignore
    //private int salary;
}

