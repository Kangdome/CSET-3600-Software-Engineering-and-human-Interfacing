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
        // add minus before conversion if the variableNum is less than 0
        if (variableNum < 0) { // convert the variableNum to a string
            String numberStr = "" + variableNum;

            // remove minus before the variableNum
            numberStr = numberStr.substring(1);
            // add minus before the variableNum and convert the rest of variableNum
            return "negative " + numberToWord(Double.parseDouble(numberStr));
        }
        // check if variableNum is divisible by 1 million
        if ((variableNum / 1000000000) >= 1) {
//            System.out.println("Bill pre-op variableNum value: " + variableNum);
            words += numberToWord((long)variableNum / 1000000000) + "billion ";
            variableNum = variableNum %=1000000000;
        }

        if ((variableNum / 1000000) >= 1) {
            words += numberToWord((int) variableNum / 1000000) + " million ";
            variableNum %= 1000000;
        }
        // check if variableNum is divisible by 1 thousand
        if ((variableNum / 1000) >= 1) {
            words += numberToWord((int) variableNum / 1000) + " thousand ";
            variableNum %= 1000;
        }
        // check if variableNum is divisible by 1 hundred
        if ((variableNum / 100) >= 1) {
            words += numberToWord((int) variableNum / 100) + " hundred ";
            variableNum %= 100;
        }

        if (variableNum >= 1) {
            // check if variableNum is within teens
            if (variableNum < 20) {
                // fetch the appropriate value from unit array
                words += onesArray[(int) variableNum];
                variableNum %= (int) variableNum;
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[(int) variableNum / 10];
                if (((int) variableNum % 10) > 0) {
                    words += " " + onesArray[(int) variableNum % 10];
                }
            }
        }
//        System.out.println(variableNumRemainder);



        if (variableNumRemainder != 0) {

            int i = 0;

            //System.out.println("prepoint value: "+ variableNumRemainder);

            if (i == 0) {
                words += " point ";
            }
            while (i < 4) {
                variableNumRemainder = variableNumRemainder * 10;
                //System.out.println("while loop after variableNum *10: " + (int)variableNumRemainder);

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
