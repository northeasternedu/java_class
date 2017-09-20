package com.edu.java.hw2;

import java.util.Collections;

public class Triangle {

    public static void main(String[] args) {
        printIsoscelesTriangle(10);
    }

    public static void printIsoscelesTriangle(int length) {

        String s = new String();

        for (int linenum=1; linenum<=length; linenum++) {
            if (linenum==1 || linenum==length) {
                s = String.join("", Collections.nCopies(linenum, "*"));
            } else {
                s = "*" + String.join("", Collections.nCopies(linenum - 2, " ")) + "*";
            }
            System.out.println(s);
        }
    }
}
