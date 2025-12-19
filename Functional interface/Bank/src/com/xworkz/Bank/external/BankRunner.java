package com.xworkz.Bank.external;


import com.xworkz.Bank.internal.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = (amount, rate) -> (amount * rate) / 100;
        double interest = bank.interest(10000, 5.5);
        System.out.println("Interest: " + interest);
    }
}

