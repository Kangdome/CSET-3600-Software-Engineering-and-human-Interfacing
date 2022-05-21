package com.company;

public class BankAccount {
    private double balance;
    public double cBalance = 0.0;
    public double sBalance = 0.0;

    //set balance
    public BankAccount() {
        balance = cBalance + sBalance;
    }

    //get balance (C+S)
    public double getBalance() {
        return cBalance + sBalance;
    }

    //SAVING----------------------------------------------------------------------------------------------------------------
    //deposit
    public void sDeposit(double total) {
        sBalance = total + sBalance;
    }

    //withdraw
    public void sWithdraw(double total) {
        sBalance = sBalance - total;
    }

    //get balance
    public double getSBalance() {
        return sBalance;
    }

    //CHECKING--------------------------------------------------------------------------------------------------------------
//deposit
    public void cDeposit(double total) {
        cBalance = total + cBalance;
    }

    //withdraw
    public void cWithdraw(double total) {
        cBalance = cBalance - total;
    }

    //get balance
    public double getCBalance() {
        return cBalance;
    }
    /* -------------------------------------APPLYING MONTHLY FEE!------------------------------------------------------*/

    public void applyMonthlyFee(double fee) {
        cBalance = cBalance * fee;
    }
    /*--------------------------------------------------APPLYING INTEREST EARNINGS!------------------------------------*/
    public void applyInterestEarnings(double interestRate){
        sBalance = sBalance * interestRate;
    }
}

