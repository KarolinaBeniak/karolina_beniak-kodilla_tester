package com.kodilla.bank.homework;

public class CashMachine {
    double[] transactions;//tablica przedstawia liczbe transakcji

    public CashMachine(double [] transactions) {
        this.transactions = transactions;
    }
    public int getTransactions() {
        return transactions.length;
    }

    public double getBalance() {  //liczymy saldo
        double sum = 0;
        for (double transaction : transactions) {
            sum += transaction;
        }
        return sum;
    }

    public int getNumberOfDeposits() { // ilość transakcji wpłat
        int sum = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                sum++;
            }
        }
        return sum;
    }

    public int getNumberOfWithdrawals() { // ilość transakcji wypłat
        int sum = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                sum++;
            }
        }
        return sum;
    }
    public double getCountOfDeposits() { // wartosc transakcji wpłat
        if (this.transactions.length == 0) {
            return 0;
        }

        if (getNumberOfDeposits() == 0) {
            return 0;
        }
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                sum = sum + transaction;
            }
        }
        return sum;
    }

    public double getCountOfWithdrawals() { //wartosc transakcji wypłat
        if (this.transactions.length == 0) {
            return 0;
        }
        if (getNumberOfWithdrawals() == 0) {
            return 0;
        }
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                sum = sum + transaction;
            }
        }
        return sum;
    }

    public double getAverageDeposits() {  //średnia wartość wpłaty
        if (this.transactions.length == 0) {
            return 0;
        }

        if (getNumberOfDeposits() == 0) {
            return 0;
        }
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                sum = sum + transaction;
            }
        }
        return (sum/getNumberOfDeposits());
    }

    public double getAverageWithdrawals() { //średnia wartiość wypłaty
        if (this.transactions.length == 0) {
            return 0;
        }
        if (getNumberOfWithdrawals() == 0) {
            return 0;
        }
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                sum = sum + transaction;
            }
        }
        return (sum/getNumberOfWithdrawals());
    }
}