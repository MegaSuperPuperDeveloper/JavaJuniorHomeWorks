package org.example.HomeWorks.HomeWork4;

import javax.persistence.*;

// Задание: Настройте связь между вашим приложением и базой данных MySQL с использованием Hibernate. Создайте несколько объектов Person и сохраните их в базу данных.
@Entity
@Table(name = "People")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}