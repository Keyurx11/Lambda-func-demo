package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerFunction {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("London");
        stringArrayList.add("Swansea");
        stringArrayList.add("Cardiff");
        stringArrayList.add("Bristol");

        stringArrayList.forEach(s -> {
            if (s.length() <= 6) {
                System.out.println(s);
            }
        });

        stringArrayList.forEach(System.out::println);

        Consumer<String> method = (s -> {
            System.out.println(s);
        });

    }
}
