package com.abdushukur.interprobe_bootcamp_homework.entity;


import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(generator = "USER")
    @SequenceGenerator(name = "USER", sequenceName = "USER_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 50, nullable = false)
    private String surname;

    @Column(name = "EMAIL", length = 50, nullable = false)
    private String email; //

    @Column(name = "PHONE_NUMBER", length = 15, nullable = false)
    private String phoneNumber;
}
