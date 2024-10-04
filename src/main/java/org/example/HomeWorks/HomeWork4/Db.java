package org.example.HomeWorks.HomeWork4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Db {

    public static void connection() {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();

            Person person1 = new Person("Nikolay", 16);
            Person person2 = new Person("Dmitry", 16);
            Person person3 = new Person("Alexander", 22);

            session.beginTransaction();
            session.save(person1);
            session.save(person2);
            session.save(person3);
            session.getTransaction().commit();

        }
    }

}