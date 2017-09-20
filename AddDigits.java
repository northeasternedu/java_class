package com.edu.java.hw2;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println("The sum of all digits of 0 is " + addDigits(0));
        System.out.println("The sum of all digits of 123 is " + addDigits(123));
        System.out.println("The sum of all digits of -123 is " + addDigits(-123));
    }

    public static int addDigits(int input) {
        boolean negative = (input < 0);
        input = Math.abs(input);

        int sum = 0;
        int remain = 0;

        while (input > 0) {
            remain = input % 10;
            sum += remain;
            input = input / 10;
        }

        return negative ? -sum : sum;
    }
}