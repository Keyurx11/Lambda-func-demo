package org.example;

interface StringFunction<T> {
    T func(T word);
}

interface NumberFunction {
    int func(int n);
}

public class block {
    public static void main(String[] args) {
        StringFunction stringFunction;

        StringFunction<String> reverse = (str) -> {
            String reverseWord = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseWord += str.charAt(i);

            }
            return reverseWord;
        };

        System.out.println("Lambda reverse is: " + reverse.func("lambda"));
        System.out.println("Kai reverse is: " + reverse.func("Kai"));

        NumberFunction factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.func(5));
    }
}
