package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankTestSuite {
    @Test
    public void shouldTotalBalance() {
        CashMachine[] bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10, 100, -50});
        bankCashMachines[1] = new CashMachine(new double[]{50, 30});
        bankCashMachines[2] = new CashMachine(new double[]{50, 50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(240, bank.getTotalBalance(),0.01);
    }
    @Test
    public void shouldZeroBalance() {
        CashMachine[] bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{ 100});
        bankCashMachines[1] = new CashMachine(new double[]{-50});
        bankCashMachines[2] = new CashMachine(new double[]{-50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(0, bank.getTotalBalance(),0.01);
    }

    @Test
    public void shouldTotalNumberTransactionsOfAllMachines(){
        CashMachine[] bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10, 100, -50});
        bankCashMachines[1] = new CashMachine(new double[]{50, 30});
        bankCashMachines[2] = new CashMachine(new double[]{50, 50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(7, bank.getTotalNumberOfAllTransactions(), 0.01);
    }
    @Test
    public void shouldCountNumberAllDeposits() {
        CashMachine[]bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10,100,-50});
        bankCashMachines[1] = new CashMachine(new double[]{50,30});
        bankCashMachines[2] = new CashMachine(new double[]{50,50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(6,bank.getCountNumberOfAllDeposits());
    }
    @Test
    public void shouldCountNumberAllWithdrawals() {
        CashMachine[] bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10, 100, -50});
        bankCashMachines[1] = new CashMachine(new double[]{50, 30});
        bankCashMachines[2] = new CashMachine(new double[]{50, 50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(1, bank.getCountNumberOfAllWithdrawals());
    }
    @Test
    public void shouldCountValueOfAllDeposits() {
        CashMachine[]bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10,100,-50});
        bankCashMachines[1] = new CashMachine(new double[]{50,30});
        bankCashMachines[2] = new CashMachine(new double[]{50,50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(290,bank.getCountValueOfDeposits());

    }
    @Test
    public void shouldCountValueOfAllWithdrawals(){
        CashMachine[]bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10,100,-50});
        bankCashMachines[1] = new CashMachine(new double[]{50,30});
        bankCashMachines[2] = new CashMachine(new double[]{50,50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(-50,bank.getCountValueOfWithdrawals());

    }
    @Test
    public void shouldCalcAverageOfAllDeposits(){
        CashMachine[]bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10,100,-50});
        bankCashMachines[1] = new CashMachine(new double[]{50,30});
        bankCashMachines[2] = new CashMachine(new double[]{50,50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(48.33,bank.getAverageTotalOfDeposits(),0.01);
    }
    @Test
    public void shouldCalcAverageOfAllWithdrawals(){
        CashMachine[]bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{10,100,-50});
        bankCashMachines[1] = new CashMachine(new double[]{50,30});
        bankCashMachines[2] = new CashMachine(new double[]{50,50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(-50,bank.getAverageTotalOfWithdrawals(),0.01);
    }

    @Test
    public void shouldGetNumberOfAllTransactionsFromTwoOutOffThreeMachines(){
        CashMachine[]bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[]{10,100,-50});
        bankCashMachines[1] = new CashMachine(new double[]{50,30});
        Bank bank = new Bank(bankCashMachines);

        double countOfAllTransactionsOffTwoMachines = bank.getTotalNumberOfAllTransactions();
        assertEquals(5,countOfAllTransactionsOffTwoMachines);
    }
    @Test
    public void shouldReturnZeroOfAverageFromWithdrawals() {
        CashMachine[]bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{});
        bankCashMachines[1] = new CashMachine(new double[]{50});
        bankCashMachines[2] = new CashMachine(new double[]{50});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(0, bank.getAverageTotalOfWithdrawals());
    }
    @Test
    public void shouldReturnAverageIfOneCashMachineIsEmpty() {
        CashMachine[]bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[]{});
        bankCashMachines[1] = new CashMachine(new double[]{50});
        bankCashMachines[2] = new CashMachine(new double[]{-10});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(40, bank.getAverageTotalOfWithdrawals() + bank.getAverageTotalOfDeposits(),0.01);
    }
}


