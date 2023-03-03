package org.example;

interface MyNumber {
    Double getNum(Double x);
}

interface oddOrEven {
    Boolean isOdd(Integer n);
}

interface basicMath {
    Integer calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        MyNumber myNumber;
        myNumber = (x) -> 123.45;

        System.out.println(myNumber.getNum(1.0));

        myNumber = (x) -> 123.45 * Math.random();

        System.out.println(myNumber.getNum(100.0));
        //Same for isNegative or Positive like (n) -> n>= 0;
        oddOrEven oddOrEven;
        oddOrEven = (n) -> (n % 2) == 0;

        if (oddOrEven.isOdd(10)) {
            System.out.println("is even");
        }
        if (!oddOrEven.isOdd(9)) {
            System.out.println("is odd");
        }

        basicMath basicMath;
        basicMath add = (a, b) -> a + b;
        basicMath susbstract = (a, b) -> a - b;
        basicMath multiply = (a, b) -> a * b;

        System.out.println(add.calculate(1, 2));
        System.out.println(susbstract.calculate(12, 3));
        System.out.println(multiply.calculate(12, 3));
    }
}