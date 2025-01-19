package com.srpingcore.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class GymMember {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int memberId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    @Column(name = "membership_start_date", nullable = false)
    private Timestamp membershipStartDate;

}