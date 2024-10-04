package org.example;

import org.example.HomeWorks.HomeWork1;
import org.example.HomeWorks.HomeWork2;
import org.example.HomeWorks.HomeWork4.Db;
import org.example.HomeWorks.Student;

import java.io.*;
import java.sql.SQLException;
import java.util.Arrays;

public class  Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        System.out.println(HomeWork1.average(Arrays.asList(1.0d, 2.5d, 12d, 13.2d)));
        HomeWork2.getAllMethodsOfString();
        //region HW3
        Student student = new Student("Николай", 16, 213.3d);
        try (FileOutputStream fileOutputStream = new FileOutputStream("student.bin")) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
                objectOutputStream.writeObject(student);
            }
        }
        try (FileInputStream fileOutputStream = new FileInputStream("student.bin")) {
            try (ObjectInputStream objectOutputStream = new ObjectInputStream(fileOutputStream)){
                student = (Student) objectOutputStream.readObject();
            }
        }
        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний балл: " + student.getGPA());

        // Поле GPA выводит 0, поскольку имеет модификатор transient, он означает что при десериализации, мы не можем получить его значение.
        //endregion
        Db.connection();
    }
}