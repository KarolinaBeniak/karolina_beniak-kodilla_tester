package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item water = new Item("water", 2.0);
    Item butter = new Item("Butter", 6.0);
    Item salt = new Item("Salt", 3.0);
    Item apple = new Item("Apple", 0.5);

    @Test
    public void addNewElementAndCheckTabSize() {

        int numberOfItems = invoice.getSize();
        assertEquals(4, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {


        Item result = invoice.getItem(3);
        assertEquals("Apple", result.getName());
        assertEquals(0.5, result.getPrice(), 0.01);

    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {


        Item result = invoice.getItem(-1);
        assertNull(result);

    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {


        Item result = invoice.getItem(5);
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {



        invoice.clear();

        assertEquals(0, invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(water);
        invoice.addItem(butter);
        invoice.addItem(salt);
        invoice.addItem(apple);
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
