package com.edu.java.hw2;

public class PerfectNumber {
    public static void main(String[] args) {
        printPerfectNumbers(-1);
        printPerfectNumbers(0);
        printPerfectNumbers(29);
    }

    public static void printPerfectNumbers(int n) {
        if (n <= 0) {
            System.out.println(Integer.toString(n) + " is not a positive number");
        } else {
            for (int i=1; i <=n; i++) {
                int j=1;
                int sum=0;
                while(j<i){
                    if(i%j==0) sum = sum + j;
                    j++;
                }
                if(sum==i) System.out.println(Integer.toString(i));
            }
        }
    }
}
