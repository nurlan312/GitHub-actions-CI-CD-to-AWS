package com.peaksoft.githubactionscicdtoaws.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    private static final String SEQ_NAME = "user_generator";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;
    private String name;
    private int age;
}
