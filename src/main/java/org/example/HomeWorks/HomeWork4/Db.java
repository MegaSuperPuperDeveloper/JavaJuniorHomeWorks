package org.example.HomeWorks.HomeWork4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Db {

    public static void con() {
        try (StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build()) {
            try (SessionFactory sessionFactory = new MetadataSources(standardServiceRegistry)
                    .buildMetadata()
                    .buildSessionFactory()) {
                try (Session session = sessionFactory.openSession()) {

                    Person person1 = new Person("Nikolay", 16);
                    Person person2 = new Person("Dmitry", 17);
                    Person person3 = new Person("Andrey", 18);

                    session.beginTransaction();
                    session.save(person1);
                    session.save(person2);
                    session.save(person3);
                    session.getTransaction().commit();

                }
            }
        }
    }

}