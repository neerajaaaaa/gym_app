package com.srpingcore.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class gymAdmin  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int admin_id;
    private String name;
    private String email;
    private String role;
    private int phone_number;
    private Timestamp last_login;

}
