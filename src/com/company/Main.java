package com.company;

public class Main {
    public static void main(String[] args) {
        BankAccaunt bankAccount = new BankAccaunt();
        bankAccount.deposit(20000);
        while (true) {
            System.out.println("your balance = " + bankAccount.getAmont());
            try {
                System.out.println("removed commision 30%" + bankAccount.withDraw(6000)
                        + "your balance = " + bankAccount.getAmont());
            } catch (LimitExcption LimitExcption) {
                System.out.println(LimitExcption.getMessage() + "remainder = " + LimitExcption.getLocalizedMessage());
                System.out.println("your balance = " + LimitExcption.getRemainingAmount());
                return;
            }
        }
    }
}