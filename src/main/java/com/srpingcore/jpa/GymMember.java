package com.srpingcore.jpa;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

@Entity
@Data
public class GymMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @Autowired
    private gymFrontdesk trainer_name;
    @Column(name = "membership_start_date", nullable = false)
    private Timestamp membershipStartDate;

}