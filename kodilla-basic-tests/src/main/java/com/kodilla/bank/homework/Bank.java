package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachine;
    private int numberOfDevices;

    public Bank(int numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
        this.cashMachine = new CashMachine[numberOfDevices];

        for (int i = 0; i < cashMachine.length; i++) {
            cashMachine[i] = new CashMachine();
        }
    }

    public int getNumberOfDevices() { //liczba urzadzen
        return numberOfDevices;
    }

    public void addTransaction(int deviceNumber, int amount) {
        if (deviceNumber < cashMachine.length) {
            cashMachine[deviceNumber].addTransaction(amount);
        }
    }

    public int getTotalBalance() { //całkowity bilans ze wszystkich bankomatów
        int sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getBalance();
        }
        return sum;
    }

    public double getCountTransactionsOfWithdrawals() { // liczba transakcji dot.wypłaty
        double sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public int getCountTransactionsOfDeposits() { // liczba transakcji dot. wpłaty
        int sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getNumberOfDeposits();
        }
        return sum;
    }

    public double getAverageTotalOfWithdrawals() { // średnia wartość wypłaty
        if (this.cashMachine.length == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getAverageWithdrawals();
        }
        return (sum / cashMachine.length);
    }

    public double getAverageTotalOfDeposits() { // średnia wariość wpłaty
        if (this.cashMachine.length == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getAverageDeposit();
        }
        return (sum / cashMachine.length);
    }
}