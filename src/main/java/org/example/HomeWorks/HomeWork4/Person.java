package org.example.HomeWorks.HomeWork4;

import jakarta.persistence.*;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}