package com.kongkong.jjjjapi.Home.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Test {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
