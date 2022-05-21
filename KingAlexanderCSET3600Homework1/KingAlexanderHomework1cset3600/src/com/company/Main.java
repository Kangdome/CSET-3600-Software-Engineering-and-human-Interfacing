/*
Alexander J King
CSET 3600
Homework 1 - asking a user for their final grade and requiring 80+ for a pass.
9/1/2019
 */



package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // grabbing the scanner

        System.out.println("Enter your final grade (numbers only: EX 79.9)"); // asking the user for their final grade and attemping to ensure expected input type.
        float grade = scan.nextFloat(); // accepting float inputs.

        if (grade >=80)  //if grade is greater than or equal to 80
        System.out.println("you passed"); //then you passes
        else
            System.out.println("You Failed"); //else you failed.
    }
}
//program will presumably accept numbers over 100 and less than zero. I dont see this as a major issue for the functionality in its current form.
