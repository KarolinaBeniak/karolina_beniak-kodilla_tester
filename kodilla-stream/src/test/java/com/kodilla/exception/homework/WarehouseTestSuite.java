package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test
    public void testIfOrderIsExist() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("JK-55"));
        //when
        Order result1 = warehouse.getOrder("JK-55");
        //then
        assertEquals("JK-55", result1.getNumber());

    }

    @Test(expected = OrderDoesntExistException.class)
    public void testIfOrderIsExist_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.getOrder("PJ-23");
    }
}