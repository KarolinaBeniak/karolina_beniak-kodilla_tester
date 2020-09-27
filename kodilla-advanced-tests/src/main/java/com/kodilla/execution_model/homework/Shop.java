package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.Set;

public class Shop {
    private Set<Order> orders =new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }
}
