package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    private boolean checkOrderIfExists(Order order) {
        return this.orders.contains(order);
    }

    public void addNewOrderToList(Order order) {
        if (!checkOrderIfExists(order)) {
            orders.add(order);
        } else {
            System.out.println("Ten obiekt już istnieje");
        }
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> getOrdersListFromLastHalfOfYear() {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(LocalDate.now().minusMonths(6)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersFromRangeDate(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(from.minusDays(1)) && o.getDate().isBefore(to.plusDays(1)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByRangeOfAmounts(int minPrice, int maxPrice) {
        List<Order> tempOrders = new ArrayList<>();
        for (Order order : this.orders) {
            if (order.getPrice() >= minPrice && order.getPrice() <= maxPrice)
                tempOrders.add(order);
        }
        return tempOrders;
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

    public double getSumAllOrdersPrice() {
        if (orders.size() == 0) {
            return 0;
        } else {
            double sum = getOrders()
                    .stream()
                    .mapToDouble(Order::getPrice).sum();
            return sum;
        }

    }

    public int getSize() {
        return this.orders.size();
    }
}


