package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

//    public Optional<Order> getOrder(String orderNumber) {
//
//        orders.stream().filter(o -> o.ge)
//            return Optional.empty();
//        }



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

    public double getSumAllOrdersPrice() {
//        double sum = 0;
//        for (Order order : orders) {
//            sum += order.getPrice();
//        }
//        return sum;
// alternatywnie:
        return orders.stream().mapToDouble(Order::getPrice).sum();
    }

    public int getSize() {
        return this.orders.size();
    }

}
