package com.edu.java.hw2;

import java.util.Collections;

public class Customer {
    String customerId;
    String address;
    String name;
    String phone;

    public Customer(String phone) {
        this.customerId = phone;
        this.phone = phone;
    }

    public Customer(String address, String name, String phone) {
        this.customerId = phone;
        this.address = address;
        this.name = name;
        this.phone = phone;
    }
}
