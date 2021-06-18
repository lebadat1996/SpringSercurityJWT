package com.example.demodocker.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class UserEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String email;
}
