package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(100.0, LocalDate.of(2020, 7, 4), "Benia1");
    Order order2 = new Order(50.0, LocalDate.of(2020, 1, 1), "Wenusmon13");
    Order order3 = new Order(100.0, LocalDate.of(2019, 5, 14), "Lejdi3");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddAllOrders() {
        assertEquals(3, shop.getSize());
    }

    @Test
    public void shouldReturnOrdersListFromLastHalfOfYear() {
        List<Order> result = shop.getOrdersListFromLastHalfOfYear();
        assertEquals(1, result.size());
    }

    @Test
    public void shouldSumAllOrderPrice() {
        double sum = shop.getSumAllOrdersPrice(order1.getPrice() + order2.getPrice() + order3.getPrice());
        assertEquals(250.0, sum, 0.01);
    }

    @Test
    public void shouldReturnHighestPriceOrder() {
        double result = shop.getMaxValue();
        assertEquals(100.0, result);
    }

    @Test
    public void shouldReturnLowestPriceOrder() {
        double result = shop.getMinValue();
        assertEquals(50.0, result);
    }


    @Test
    public void shouldGetOrdersFromJanuary() {
        List<Order> result = shop.getOrdersFromRangeMinMax(LocalDate.of(2019, 12, 31), LocalDate.of(2020, 2, 1));
        assertEquals(1, result.size());
    }

    @Test
    public void shouldGetOrderFromEmptyRange() {
        List<Order> result = shop.getOrdersFromRangeMinMax(LocalDate.of(2018, 2, 28), LocalDate.of(2018, 4, 1));
        assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnZeroIfTryingToGetOrdersOutOfDatesRange() {
        List<Order> result = shop.getOrdersFromRangeMinMax(LocalDate.of(2018, 6, 1), LocalDate.of(2019, 1, 1));
        assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnZeroSumIfNoOrdersExists() {
        double result = shop.getSumAllOrdersPrice(0);
        assertEquals(0, result);
    }


    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}
