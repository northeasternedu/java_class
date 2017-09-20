package com.edu.java.hw2;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    Customer customer;
    List<Pizza> pizzas;
    int price;

    public CustomerOrder(Customer customer) {
        this.customer = customer;
    }

    public CustomerOrder(Customer customer, List<Pizza> pizzas) {
        this.customer = customer;
        this.pizzas = pizzas;
    }

    public double getInvoice() {
        int price;

        for (int i = 0; i < pizzas.size(); i++)
            this.price += pizzas.get(i).get_price();
        return this.price;
    }

    public static void main(String[] args) {
        Customer me = new Customer("206-866-8666");
        List<Pizza> myPizzas = new ArrayList<Pizza>();
        CustomerOrder myOrder;

        myPizzas.add(new Pizza(Pizza.PizzaType.LARGE, 10));
        myPizzas.add(new Pizza(Pizza.PizzaType.MEDIUM, 5));

        myOrder = new CustomerOrder(me, myPizzas);
        System.out.println("The invoice of my order is " + myOrder.getInvoice());

    }
}