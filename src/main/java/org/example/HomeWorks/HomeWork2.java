package org.example.HomeWorks;

import java.lang.reflect.Method;

// Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.
public class HomeWork2 {
    public static void getAllMethodsOfString()  {
        String obj = "";
        Method[] methods = obj.getClass().getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }
    }
}