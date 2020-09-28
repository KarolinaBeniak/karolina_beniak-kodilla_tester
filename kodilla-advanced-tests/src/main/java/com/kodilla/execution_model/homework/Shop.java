package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

    public List<Order> returnOrderListFromLastHalfOfYear() {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(LocalDate.now().minusMonths(6)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersFromRangeMinMax(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(from) && o.getDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public double returnSumAllOrdersPrice() {
        double sum = 0;
        for (Order order : orders) {
            sum += order.getPrice();
        }
        return sum;
    }

    public int getSize() {
        return this.orders.size();
    }

}
