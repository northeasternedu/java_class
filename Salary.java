package com.edu.java.hw2;

public class Salary {

    public static final double PAID_HOURS = 36;
    public static final double PAID_HOURS_RATE = 15.0;
    public static final double EXTRA_HOURS_RATE = PAID_HOURS_RATE * 1.5;

    public static void main(String[] args) {
        System.out.println("Salary of 1 working hour is " + employeeSalary(1));
        System.out.println("Salary of -1 working hour is " + employeeSalary(-1));
        System.out.println("Salary of 36 working hour is " + employeeSalary(36));
        System.out.println("Salary of 40 working hour is " + employeeSalary(40));
    }

    public static double employeeSalary(double hours){
        if (hours < 0)
            return 0;
        else
            return (hours <= PAID_HOURS) ? hours * PAID_HOURS_RATE : PAID_HOURS * PAID_HOURS_RATE +
                (hours - PAID_HOURS) * EXTRA_HOURS_RATE;
    }
}
