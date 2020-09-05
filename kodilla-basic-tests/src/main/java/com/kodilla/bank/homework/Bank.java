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

    public double getTotalNumberOfAllTransactions() { //całkowity bilans ze wszystkich bankomatów
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
        double sum = 0;
        int transaction = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            transaction+= this.bankCashMachines[i].getNumberOfWithdrawals();
            sum += this.bankCashMachines[i].getCountOfWithdrawals();
        }
        if(transaction == 0)
            return 0;
        return sum / transaction;
    }
    public double getAverageTotalOfDeposits() { // średnia wariość wpłaty
        double sum = 0;
        int transaction = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            transaction+= this.bankCashMachines[i].getNumberOfDeposits();
            sum += this.bankCashMachines[i].getCountOfDeposits();
        }
        if(transaction == 0)
            return 0;
        return sum / transaction;
    }
}