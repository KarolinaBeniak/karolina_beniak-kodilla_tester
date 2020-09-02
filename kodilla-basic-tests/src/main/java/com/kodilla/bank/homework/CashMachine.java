package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions; //tablica przedstawia liczbe transakcji
    private int size;// liczba transakcji

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length); //kopiowanie tablicy źródłowej do tablicy docelowej, zachowując obecny układ elementów
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }
    public int getNumberOfAllTransactions(){
        int sum = 0;
        for (int i = 0; i <transactions.length; i++){
            sum = sum + getTransactions().length;
        }
        return sum;
    }
    public int getBalance() {  //liczymy saldo
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum = sum + transactions[i];
        }
        return sum;
    }

    public int getNumberOfDeposits() { // wpłata
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum++;
            }
        }
        return sum;
    }

    public double getNumberOfWithdrawals() { //wypłata
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum++;
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
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum = sum + transactions[i];
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
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum = sum + transactions[i];
            }
        }
        return (sum/getNumberOfWithdrawals());
    }
}