package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;
import  org.junit.jupiter.api.Test ;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        assertEquals(0, cashMachine.getTransactions());
    }

    @Test
    public void shouldReturnCountOfBalance() {
        CashMachine cashMachine = new CashMachine(new double[]{100, -400});
        assertEquals(-300, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnSumOfDeposits() { // ile było transakcji wpłaty
        CashMachine cashMachine = new CashMachine(new double[]{100, -400, 1000, -500, 0, 50, -200});
        assertEquals(3, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldReturnSumOfWithdrawals() { // ile było transakcji wypłaty
        CashMachine cashMachine = new CashMachine(new double[]{100, -400, 1000, -500, 0, 50, -200});
        assertEquals(3, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageOfDeposits() { // jaka jest średnia wartość wpłat
        CashMachine cashMachine = new CashMachine(new double[]{100, -400, 1000, -500, 0, 50, -200});
        assertEquals(383.33, cashMachine.getAverageDeposits(), 0.01);
    }

    @Test
    public void shouldReturnAverageOfWithdrawals() { // jaka jest średnia wartość wypłat
        CashMachine cashMachine = new CashMachine(new double[]{100, -400, 1000, -500, 0, 50, -200});
        assertEquals(-366.67, cashMachine.getAverageWithdrawals(), 0.01);
    }

    @Test
    public void shouldReturnBalanceZeroIfNoTransactionsWereMade() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnAverageZeroIfNoTransactionsWereMade() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        assertEquals(0.0, cashMachine.getAverageDeposits() + cashMachine.getAverageWithdrawals(), 0.01);
    }


    @Test
    public void shouldReturnZeroTransactions() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        assertEquals(0, cashMachine.getTransactions());
    }

    @Test
    public void shouldReturnBalanceOfWithdrawalsIsZeroIfNoWithdrawals() { // brak transakcji wypłaty
        CashMachine cashMachine = new CashMachine(new double[]{100, 50, 60, 0, 50});
        assertEquals(0, cashMachine.getCountOfWithdrawals());
    }

    @Test
    public void shouldReturnBalanceOfDepositsIsZeroIfNoDeposits() { //brak transakcji wpłaty
        CashMachine cashMachine = new CashMachine(new double[]{-100, -50, -60, 0, -50});
        assertEquals(0, cashMachine.getCountOfDeposits());
    }

    @Test
    public void shouldReturnCountOfDeposits() { //suma wpłat
        CashMachine cashMachine = new CashMachine(new double[]{-100, -50, -60, 0, 100, 30, 90});
        assertEquals(220, cashMachine.getCountOfDeposits());
    }

    @Test
    public void shouldReturnCountOfWithdrawals() { // suma wypłat
        CashMachine cashMachine = new CashMachine(new double[]{-100, -50, -60, 0, 100, 30, 90});
        assertEquals(-210, cashMachine.getCountOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageOfOneTransactionOfDeposits() { // jedna transakcja wpłaty
        CashMachine cashMachine = new CashMachine(new double[]{100, -400, -500, 0, -200});
        assertEquals(100, cashMachine.getAverageDeposits(), 0.01);
    }

    @Test
    public void shouldReturnAverageOfOneTransactionOfWithdrawals() { // jaka jest średnia wartość wypłat
        CashMachine cashMachine = new CashMachine(new double[]{100, -400, 1000, 0, 50});
        assertEquals(-400, cashMachine.getAverageWithdrawals(), 0.01);
    }

    @Test
    public void shouldReturnAverageWithdrawalEqualsZeroIfNoWithdrawals() {
        CashMachine cashMachine = new CashMachine(new double[]{100, 1000, 0, 50});
        assertEquals(0.0, cashMachine.getAverageWithdrawals(), 0.01);
    }

    @Test
    public void shouldReturnAverageDepositsEqualsZeroIfNoDeposits() {
        CashMachine cashMachine = new CashMachine(new double[]{-100, -1000, 0, -50});
        assertEquals(0.0, cashMachine.getAverageDeposits(), 0.01);
    }
}