package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("KB-12"));
        warehouse.addOrder(new Order("PM-10"));
        warehouse.addOrder(new Order("TP-06"));
        warehouse.addOrder(new Order("KJ-01"));

        try {
            warehouse.getOrder("PJ-23");
        } catch (OrderDoesntExistException ex) {
            System.out.println("Sorry, that order doesn't exist");
        } finally {
            System.out.println("Thank you for choosing our warehouse!");
        }
    }
}
