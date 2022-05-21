package com.company;

public class NumbersToWords extends Main {

    public static String numberToWord(double variableNum) {

        double variableNumRemainder =0;

        int ii =0;
        if (ii == 0){
            variableNumRemainder = variableNum-(long) variableNum;
            ii++;
        }


        // variable to hold string representation of variableNum
        String words = "";
        String onesArray[] = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ",
                "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ",
                "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ",
                "eighteen ", "nineteen "};
        String tensArray[] = {"10zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        if (variableNum == 0) {
            return "Zero ";
        }
        // if negative add the word negative
        if (variableNum < 0) { // convert the variableNum to a string
            String numberStr = "" + variableNum;

            //remove negative symbol and
            numberStr = numberStr.substring(1);
            // add minus before the variableNum and convert the rest of variableNum
            return "negative " + numberToWord(Double.parseDouble(numberStr));
        }
        // see if divisible by a billion
        if ((variableNum / 1000000000) >= 1) {
//            System.out.println("Bill pre-op variableNum value: " + variableNum);
            words += numberToWord((long)variableNum / 1000000000) + "billion ";
            variableNum = variableNum %=1000000000;
        }

        if ((variableNum / 1000000) >= 1) {
            words += numberToWord((int) variableNum / 1000000) + " million ";
            variableNum %= 1000000;
        }
        //see if divisible by a thousand
        if ((variableNum / 1000) >= 1) {
            words += numberToWord((int) variableNum / 1000) + " thousand ";
            variableNum %= 1000;
        }
        // see if divisible by a hundred
        if ((variableNum / 100) >= 1) {
            words += numberToWord((int) variableNum / 100) + " hundred ";
            variableNum %= 100;
        }

        if (variableNum >= 1) {
            // see if divisible by  teens
            if (variableNum < 20) {
                // find the value in the 0-20 array
                words += onesArray[(int) variableNum];
                variableNum %= (int) variableNum;
            } else {
                // find the value in tens array
                words += tensArray[(int) variableNum / 10];
                if (((int) variableNum % 10) > 0) {
                    words += " " + onesArray[(int) variableNum % 10];
                }
            }
        }
        //if there is a remainder decimal value...
        if (variableNumRemainder != 0) {
            int i = 0;
            if (i == 0) { // on the first iteration say "point" for decimal
                words += " point ";
            }
            while (i < 4) { // list decimals to 4 significant figures
                variableNumRemainder = variableNumRemainder * 10; // multiply the remainder decimal
                if (variableNumRemainder > 0 ) {
                    if ((int) variableNumRemainder == 0){
                        words += "zero ";
                        variableNumRemainder=variableNumRemainder*10;
                        i++;
                    }
                    words += numberToWord((int) variableNumRemainder);
                    variableNumRemainder %= (int) variableNumRemainder;
                    i++;
                }

            }
        }
//        if (variableNumRemainder != 0) {
//
//            System.out.println("prepoint value: "+ variableNumRemainder);
//
//            if (i == 0) {
//                words += " point ";
//            }
//            while (i < 4) {
//                variableNumRemainder = variableNumRemainder * 10;
////                System.out.println("while loop after variableNum *10: " + variableNum);
//
//                if (variableNum > 0 ) {
//                    words += onesArray[(int) variableNumRemainder];
//                    i++;
//                }
//            }
//        }
            return words;
        }
    }
