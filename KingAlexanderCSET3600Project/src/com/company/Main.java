/*Alexander J King
CSET 3600 FINAL PROJECT
12.1.19
Numbers to words calculator: This program takes user inputs 0-10 and outputs the answer in word form. 0-10 limits outputs to 10^10 ==10 billion.
The user inputs their first numberT, then the operator, then the second number. he program will then check if all of the
user inputs are within bounds. Then it calls the math function which resolves the user inputs into their action -> solution.
The numeric double solution is then fed back to the main method and input to NumbersToWords class. Numbers to words section
utilizes arrays to store word string values of the numbers which are then added to a running string. Since arrays don't
like non-ints and because ints max out before 10^10 I used doubles for everything and simply called their (int)double value for these sections.
Decimals will output to words to the ten thousands place. I thought this was appropriate because it is what most of my math
and science classes require and the line has to be somewhere if you want an output for repeating decimals.

* */package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Math mathObject = new Math();
        System.out.println("I support doubles and output words to within 4 significant figures.");
        System.out.println("Please input the first number between (10.0 >= X >= 0.0) ");
        double double0 = mathObject.input0 = scan.nextDouble();
        System.out.println("Please input the operator function: ");
        char string0 = mathObject.operator = scan.next().charAt(0);
        System.out.println("Please input the last number between 0-10: ");
        double double1 = mathObject.input1 = scan.nextDouble();
        if (mathObject.input0 > 10.0 || mathObject.input1 < 0.0 || mathObject.input1 > 10 || mathObject.input1 < 0) {
            System.out.println("Invalid input! Input numbers must be between 0 and 10");
            System.exit(0);
        } else if (mathObject.operator == '/' && mathObject.input1 == 0) {
            System.out.println("Cannot divide by zero!");
            System.exit(0);
        }
        mathObject.doMath();
        System.out.println(NumbersToWords.numberToWord(mathObject.input0  )+ OperatorToWords.operationToWords(mathObject.operator)
                + NumbersToWords.numberToWord(mathObject.input1) + "is " + NumbersToWords.numberToWord(mathObject.getSolution()) +"." );
        //System.out.println( InputValuesToWords.operationToWords(mathObject.input0) + OperatorToWords.operationToWords(mathObject.operator) + InputValuesToWords.operationToWords(mathObject.input1)); // OperatorToWords

        System.out.println(mathObject.getSolution());
        //System.out.println(NumbersToWords.numberToWord(mathObject.getSolution())); // NumberToWords


//        System.out.println("math object solution double: " + mathObject.getSolution());
//        System.out.println("math solution as long: " + mathObject.getLongSolution());
//        if (mathObject.getSolution() > 2147483647){
//            System.out.println("too big for int. ");
        }
//        else System.out.println("Solution as int: " + mathObject.getIntSolution());
        // we get too big for int. btfo



    }



