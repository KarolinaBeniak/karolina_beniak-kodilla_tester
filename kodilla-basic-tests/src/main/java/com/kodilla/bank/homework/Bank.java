package com.kodilla.bank.homework;

public class Bank {

   CashMachine[]bankCashMachines;

    public Bank(CashMachine[]bankCashMachines) {
        this.bankCashMachines = bankCashMachines;
    }

    public double getTotalBalance() { //całkowity bilans ze wszystkich bankomatów
        double sum = 0;
        for (CashMachine bankCashMachine : this.bankCashMachines) {
            sum += bankCashMachine.getBalance();
        }
        return sum;
    }

    public double getTotalBalanceNumber() { //całkowity bilans ze wszystkich bankomatów
        double sum = 0;
        for (CashMachine bankCashMachine : this.bankCashMachines) {
            sum += bankCashMachine.getTransactions();
        }
        return sum;
    }


    public double getCountNumberOfAllWithdrawals(){ // liczba transakcji dot.wypłaty
        double sum = 0;
        for (CashMachine bankCashMachine : bankCashMachines) {
            sum = sum + bankCashMachine.getNumberOfWithdrawals();
        }
        return sum;
    }

    public int getCountNumberOfAllDeposits() { // liczba transakcji dot. wpłaty
        int sum = 0;
        for (CashMachine bankCashMachine : bankCashMachines) {
            sum = sum + bankCashMachine.getNumberOfDeposits();
        }
        return sum;
    }
    public double getCountValueOfWithdrawals(){ // wartosc transakcji dot.wypłaty
        if (this.bankCashMachines.length == 0) {
            return 0;
        }
        double sum = 0;

        for (CashMachine bankCashMachine : bankCashMachines) {
            sum = sum + bankCashMachine.getCountOfWithdrawals();
        }
        return sum;
    }
    public double getCountValueOfDeposits(){ // wartosc transakcji dot.wypłaty
        if (this.bankCashMachines.length == 0) {
            return 0;
        }
        double sum = 0;

        for (CashMachine bankCashMachine : bankCashMachines) {
            sum = sum + bankCashMachine.getCountOfDeposits();
        }
        return sum;
    }

    public double getAverageTotalOfWithdrawals() { // średnia wartość wypłaty
        if (this.bankCashMachines.length == 0) {
            return 0;
        }
        double sum = 0;

        for (CashMachine bankCashMachine : bankCashMachines) {
            sum = sum + bankCashMachine.getAverageWithdrawals();
        }
        return (sum/bankCashMachines.length);
    }

    public double getAverageTotalOfDeposits() { // średnia wariość wpłaty
        if (this.bankCashMachines.length == 0) {
            return 0;
        }
        double sum = 0;

        for (CashMachine bankCashMachine : bankCashMachines) {
            sum = sum + bankCashMachine.getAverageDeposits();
        }
        return (sum/bankCashMachines.length);
    }
}