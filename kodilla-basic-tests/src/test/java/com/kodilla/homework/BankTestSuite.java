package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankTestSuite {
    @Test
    public void shouldReturnNumberDevices() {
        Bank bank = new Bank(3);
        assertEquals(3, bank.getNumberOfDevices());
    }
    @Test
    public void shouldCountNumberAllDeposits() {
        Bank bank = new Bank(3);

        bank.addTransaction(0,30);
        bank.addTransaction(0,100);
        bank.addTransaction(0,-70);
        bank.addTransaction(0,10);

        bank.addTransaction(1,10);
        bank.addTransaction(1,-200);
        bank.addTransaction(1,-100);
        bank.addTransaction(1,-50);

        bank.addTransaction(2,50);
        bank.addTransaction(2,200);
        bank.addTransaction(2,50);
        bank.addTransaction(2,-100);

        assertEquals(7,bank.getCountTransactionsOfDeposits());
    }
    @Test
    public void shouldCountNumberAllWithdrawals() {
        Bank bank = new Bank(3);

        bank.addTransaction(0,30);
        bank.addTransaction(0,100);
        bank.addTransaction(0,-70);
        bank.addTransaction(0,10);

        bank.addTransaction(1,10);
        bank.addTransaction(1,-200);
        bank.addTransaction(1,-100);
        bank.addTransaction(1,-50);

        bank.addTransaction(2,50);
        bank.addTransaction(2,200);
        bank.addTransaction(2,50);
        bank.addTransaction(2,-100);

        assertEquals(5,bank.getCountTransactionsOfWithdrawals());
    }
    @Test
    public void shouldCalcAverageOfAllDeposits(){
        Bank bank = new Bank(3);
        bank.addTransaction(0,30);
        bank.addTransaction(0,100);
        bank.addTransaction(0,-70);
        bank.addTransaction(0,10);

        bank.addTransaction(1,10);
        bank.addTransaction(1,-200);
        bank.addTransaction(1,-100);
        bank.addTransaction(1,-50);

        bank.addTransaction(2,50);
        bank.addTransaction(2,200);
        bank.addTransaction(2,50);
        bank.addTransaction(2,-100);

        assertEquals(52.22,bank.getAverageTotalOfDeposits(),0.01);
    }
    @Test
    public void shouldCalcAverageOfAllWithdrawals(){
        Bank bank = new Bank(3);
        bank.addTransaction(0,30);
        bank.addTransaction(0,100);
        bank.addTransaction(0,-70);
        bank.addTransaction(0,10);

        bank.addTransaction(1,10);
        bank.addTransaction(1,-200);
        bank.addTransaction(1,-100);
        bank.addTransaction(1,-50);

        bank.addTransaction(2,50);
        bank.addTransaction(2,200);
        bank.addTransaction(2,50);
        bank.addTransaction(2,-100);

        assertEquals(-95.55,bank.getAverageTotalOfWithdrawals(),0.01);
    }

    @Test
    public void shouldGetNumberOfAllTransactionsFromAllMachines(){
        Bank bank= new Bank(3);
        bank.addTransaction(0,30);
        bank.addTransaction(0,100);
        bank.addTransaction(0,-70);
        bank.addTransaction(0,10);

        bank.addTransaction(1,10);
        bank.addTransaction(1,-200);
        bank.addTransaction(1,-100);
        bank.addTransaction(1,-50);

        bank.addTransaction(2,50);
        bank.addTransaction(2,200);
        bank.addTransaction(2,50);
        bank.addTransaction(2,-100);


        int countOfAllTransactions = bank.getTotalNumberBalance();
        assertEquals(12,countOfAllTransactions);
        }

    @Test
    public void shouldGetNumberOfAllTransactionsFromTwoOutOffThreeMachines(){
        Bank bank= new Bank(2);
        bank.addTransaction(0,30);
        bank.addTransaction(0,100);
        bank.addTransaction(0,-70);
        bank.addTransaction(0,10);

        bank.addTransaction(1,10);
        bank.addTransaction(1,-200);
        bank.addTransaction(1,-100);
        bank.addTransaction(1,-50);

        bank.addTransaction(2,50);
        bank.addTransaction(2,200);
        bank.addTransaction(2,50);
        bank.addTransaction(2,-100);


        int countOfAllTransactionsOffTwoMachines = bank.getTotalNumberBalance();
        assertEquals(8,countOfAllTransactionsOffTwoMachines);
    }
}


