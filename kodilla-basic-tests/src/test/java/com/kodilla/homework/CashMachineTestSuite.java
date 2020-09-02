package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;
import  org.junit.jupiter.api.Test ;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldReturnNumberBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-80);
        cashMachine.addTransaction(-60);
        assertEquals(10, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnSumOfDeposits() { // ile było transakcji wpłaty
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(10);
        cashMachine.addTransaction(23);
        cashMachine.addTransaction(-23);
        cashMachine.addTransaction(55);
        assertEquals(3, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldReturnSumOfWithdrawals() { // ile było transakcji wypłaty
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-40);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(10);
        cashMachine.addTransaction(-20);
        assertEquals(3, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageOfDeposits() { // jaka jest średnia wartość wpłat
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(10);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-30);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(55);
        assertEquals(46.25, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldReturnAverageOfWithdrawals() { // jaka jest średnia wartość wypłat
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-100);
        assertEquals(-75.0, cashMachine.getAverageWithdrawals(), 0.01);
    }
    @Test
    public  void  shouldReturnBalanceZeroIfNoTransactionsWereMade () {
        CashMachine cashMachine =  new  CashMachine ();
        assertEquals(0,cashMachine.getBalance());
    }
    @Test
    public  void  shouldReturnAverageZeroIfNoTransactionsWereMade () {
        CashMachine cashMachine =  new  CashMachine ();
        assertEquals ( 0.0 , cashMachine.getAverageDeposit () + cashMachine.getAverageWithdrawals (), 0.01 );
    }

}