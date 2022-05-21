/*# Name : ALEXANDER J KING

# Class: CSET 3600

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 9

# Date: 11/17/2019

# Summary: My program starts with a balance of zero in both the saving and checking accounts. You can add money, withdraw money, apply fees, and apply interest earnings.
Each session is its own. When you start the session it creates a new bank account with zero balances. It allows the user to return to the main menu to string multiple actions.
EX: I want to add $1000 to both accounts, then apply fees/interest to both, then make a withdraw, then check detailed balance, then end session.

I allowed for negative amounts. This is intentional. EX: You can have zero and withdraw 200 for a balance of -200. This is done with the idea of future reuse or further patching where I gouge the customers with overdraft fees.
Much like a real bank I could **CLAIM** to have overdraft protection but then I'm going to allow merchants to only check for $1.00 when their bill is actually far higher. THEN I will slap a fee for being poor
BC it is how American bankers do.

I made if statements to catch invalid inputs. Most of them just take you back to the main menu (PRESERVES SESSION).
 */


/* 	Problem 1
	Write a Java program that accomplishes the following.
	1. A superclass Bank Account that has the following: balance (attribute), and the following methods:getBalance(),
	deposit(), withdraw().

	2. A checking account that inherits from the Bank Account. In addition, the checking account
	has monthly fees. Feel free to determine the monthly fee. The checking account also has
	the following methods: applyMonthlyfee() and  getMonthlyfee().

	3. A savings account that inherits from the Bank Account. In addition, the savings account
	has an interest rate (feel free to define the rate) and the following methods: applyInterestRate(), SavingsAccount(),
	and getInterestRate().

	Based on the above, write a simple Java program that shows the relationships of the above classes
	and returns the savings amount based on the current amount in the savings account and the interest rate.

	Be creative.
   (20 Points.)
*/

package com.company;

import java.util.Scanner;

public class Main extends BankAccount {

    public static void main(String[] args) {
        boolean i = true;
        double fee = .5;
        double interestRate = 1.005;
        BankAccount uName = new BankAccount(); // make a new account
        while (i == true) {
            System.out.println("Welcome to Steal Your Dreams Financial!");
            System.out.println("Press 1 to make a withdraw.");
            System.out.println("Press 2 to make a deposit.");
            System.out.println("Press 3 to check your available balance. ");
            System.out.println("Press 4 to apply fees or interest earnings.");
            Scanner scan = new Scanner(System.in);
            int option00 = scan.nextInt();


            if (option00 == 1) {
                System.out.println("Would you like to withdraw from your Checking or Savings Account?");
                System.out.println("Press 1 for Checking.");
                System.out.println("Press 2 for Savings.");
                int whichAccount = scan.nextInt();
                if (whichAccount == 1) {
                    System.out.println("How much would you like to withdraw?");
                    double withdrawN = scan.nextDouble();
                    uName.cWithdraw(withdrawN);
                } else if (whichAccount == 2) {
                    System.out.println("How much would you like to withdraw?");
                    double withdrawN = scan.nextDouble();
                    uName.sWithdraw(withdrawN);
                } else if (whichAccount < 1 || whichAccount > 2) {
                    System.out.println("invalid input");
                }
            } else if (option00 == 2) {
                System.out.println("Would you like to deposit from your Checking or Savings Account?");
                System.out.println("Press 1 for Checking.");
                System.out.println("Press 2 for Savings.");
                int whichAccount = scan.nextInt();
                if (whichAccount == 1) {
                    System.out.println("How much would you like to deposit?");
                    double depositN = scan.nextDouble();
                    uName.cDeposit(depositN);
                } else if (whichAccount == 2) {
                    System.out.println("How much would you like to deposit?");
                    double despositN = scan.nextDouble();
                    uName.sDeposit(despositN);
                } else if (whichAccount < 1 || whichAccount > 2) {
                    System.out.println("invalid input");
                }
            } else if (option00 == 3) {
                System.out.println("Checking available balance is: " + uName.getCBalance());
                System.out.println("Savings available balance is: "+ uName.getSBalance());

            } else if (option00 == 4){
                System.out.println("Press 1 to apply monthly checking account fee.");
                System.out.println("press 2 to apply apply interest earnings.");
                int feeOrInterest = scan.nextInt();
                if (feeOrInterest == 1){
                    uName.applyMonthlyFee(fee);
                }else if (feeOrInterest==2){
                    uName.applyInterestEarnings(interestRate);
                }else if (feeOrInterest !=1 && feeOrInterest !=2){
                    System.out.println("Invalid input.");
                }
            }

            else if (option00 < 1 || option00 > 4) {
                System.out.println("Invalid input");
            }

            System.out.println("Total available balance: "+uName.getBalance());
            System.out.println("Would you like to do another transaction?");
            System.out.println("Press 1 to return to the main menu.");
            System.out.println("Press 2 to end the session.");
            int repeat = scan.nextInt();
            if(repeat==1){
                i = true;
            }
            else {
                i = false;
                System.out.println("Thank you for giving away your future to Steal Your Dreams Financial.");
                System.out.println("We're always working harder to steal your dreams!"); // this is me being "creative". Okay fine it is honest cynicism.
            }


        }
    }
}


