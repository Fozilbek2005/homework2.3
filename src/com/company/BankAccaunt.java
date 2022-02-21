package com.company;

public class BankAccaunt {

    private double amount;

    public void deposit(double sum) {
        amount = amount + sum;
    }

    public int withDraw(int sum) throws LimitExcption {
        if (amount < sum) {
            throw new LimitExcption("your balance is not enough money", getAmont());
        }
        amount = amount - sum;
        return sum;
    }

    public double getAmont() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
