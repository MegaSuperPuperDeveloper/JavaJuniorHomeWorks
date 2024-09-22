package org.example.HomeWorks;

import java.util.List;
import java.util.OptionalDouble;

public class HomeWork1 {
    public static double average(List<Double> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}