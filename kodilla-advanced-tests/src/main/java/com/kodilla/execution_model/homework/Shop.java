package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }


    public List<Order> getOrdersListFromLastHalfOfYear() {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(LocalDate.now().minusMonths(6)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersFromRangeMinMax(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(from.minusDays(1)) && o.getDate().isBefore(to.plusDays(1)))
                .collect(Collectors.toList());
    }

    public double getMinValue() {
        double minValue = getOrders()
                .stream()
                .mapToDouble(Order::getPrice).min()
                .getAsDouble();
        return minValue;
    }

    public double getMaxValue() {
        double maxValue = getOrders()
                .stream()
                .mapToDouble(Order::getPrice).max()
                .getAsDouble();
        return maxValue;
    }

    public double getSumAllOrdersPrice(double price) {
        if (price > 0) {
            double sum = getOrders()
                    .stream()
                    .mapToDouble(Order::getPrice).sum();
            return sum;
        }
        return 0;
    }

    public int getSize() {
        return this.orders.size();
    }
}


