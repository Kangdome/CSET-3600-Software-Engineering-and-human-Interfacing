package com.company;

public class Math extends Main{
    public double input0;
    public double input1;
    public char operator;
    public double solution;


    public double getInput0() {
        return input0;
    }
    public double getInput1(){
        return input1;
    }

    public double getSolution() {
        return solution;
    }
    public long getLongSolution(){
        long l =  java.lang.Math.round(solution);
        return l;
    }
    public int getIntSolution(){
        int i = (int) java.lang.Math.toIntExact(getLongSolution());
        return i;
    }


    public void doMath(){
        if (operator == '*'){
            solution = input0*input1;
        }
        else if (operator == '/'){
            solution = input0/input1;
        }
        else if (operator == '^'){
            solution = java.lang.Math.pow(input0,input1);
        }
        else if (operator == '+'){
            solution = input0+input1;
        }
        else if (operator == '-'){
            solution = input0-input1;
        }
        else if (operator == '%'){
            solution=input0%input1;
        }
        else {
            System.out.println("Invalid operator input!");
            System.exit(0);
        }
    }

}
