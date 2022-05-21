package com.company;

public class OperatorToWords {

    public static String operationToWords(char inputOp){

        String operatorArray[] = {"plus ", "minus ", "divided by ", "multiplied by ", "raised to the power ", "remainder when divided by " };
        String words =  "";

        if (inputOp == '+'){
            words += operatorArray[0];
        }
        if (inputOp == '-' ){
            words += operatorArray[1];
        }
        if (inputOp == '/' ){
            words += operatorArray[2];
        }
        if (inputOp == '*'){
            words += operatorArray[3];
        }
        if (inputOp == '^'){
            words += operatorArray[4];
        }
        if ( inputOp == '%'){
            words += operatorArray[5];
        }
        return words;
    }




}
