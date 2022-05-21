/*
Alexander King
Homework 2
CSET 3600
9.16.19
 */
/*
Create an array. This can be pre-defined, user input, or randomly generated. I elected to have the user input the values for how large the array is and their values.

The array needs to be sorted. if position 0 > 1 swap them iterate this for the length of the array and ensure it runs enough iterations. EX: 19 2 1 3 10 would need more than 1 iteration.

Ask the user to input a number to see if it is in the array. They will already know if it is or not since they created the array. Inform them yes/no.

Search the sorted array. Start in the middle and ask if the middle value is = or > else <.
If = done return value.
If > move that direction eliminating everything < and try again.
Else the opposite.
Continue until value is found. If the value cannot be found inform the user.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // have the user tell us how large the array will be.
        System.out.println("How large would you like the array to be?");
        Scanner scan = new  Scanner(System.in);
        int arrayLength = scan.nextInt();
        int arrayInt[] = new int[arrayLength]; // can put any value in arraySize. This is currently defined by the user.
        System.out.println("array size is: " +arrayLength); // return the input size verbose


        //here we sort the array from least to geatest.
        for (int count = 0; count < arrayLength; count++){ // start the count at 0, repeat for the length of the array, increment by 1.
            System.out.println("Please input the value for array position " + count +": "); // ask for unsorted user inputs for the values in the array.
            arrayInt[count] = scan.nextInt(); // apply the input values to corresponding positions within the array.
        }

        //scan.close();

        System.out.println("The array values are: "); // verbose. Remind the user what values they just input (unsorted)
        for (int count = 0; count < arrayLength; count++){
            System.out.printf(arrayInt[count] + " ");
            if (count==arrayLength-1){ // formatting. On the later iteration print a line <br>
                System.out.println(" ");
            }
        }

        /*
        fixed initializes as false and it runs while false. It is immediately made true unless it makes it through the
        if statement at which point it becomes false. So if it runs the if it keeps running otherwise it goes on.

         */
        int temp; // needed temp variable to store value
        boolean fixed = false; // initializes false
        while (fixed==false){  // while false...
            fixed = true; // becomes true

            for (int i=0; i<arrayInt.length-1; i++){
                if (arrayInt[i] > arrayInt[i+1]){ // if position 0 is greater than position 0
                    temp=arrayInt[i+1]; // store temp value
                    arrayInt[i+1] = arrayInt[i]; // put i+1 where i was
                    arrayInt[i] = temp; // put the stored value (i+1) where i was.
                    fixed = false; // only becomes false if the parameters for the IF statement are met.
                }
            }
        }
        System.out.println("Your sorted array values are: "); // verbose sorted array values
        for (int count = 0; count < arrayLength; count++){
            System.out.printf(arrayInt[count] + " ");
            if (count==arrayLength-1){ //formatting to print a line on the last iteration.
                System.out.println(" ");
            }
        }

        Boolean notFound = true; // fix my output incase arrayInt[middle] never equals search. I was having issues where this message would print if it was not found on the first iteration. This fixes that.
        int first = 0; // array first position known
        int last = arrayLength -1; // array last position
        int middle = (first + last) / 2; // middle position of the sorted array so it is also the middle value.
        System.out.println("Please input a number to see if it is in the array: "); /* asking the user to input a number
         either in or not in the array. The user knows these values because they made them and I have verbose output reminding them.
        */
        int search = scan.nextInt();

        while (first <= last){ //while the first position is greater than or equal to the last position
            if (arrayInt[middle] < search){ // if the middle position (and value) less than the searched value
                first = middle + 1; // Then eliminate all impossible options. The first becomes middle +1.
            }
            else if (arrayInt[middle] == search){ // did we find the value we're looking for? Happy days!
                System.out.println("Your number is in the array!"); // they should have know this.
                notFound = false;
                break; // End the program because we found the number!
            }
            else {
                last = middle -1; /* If the middle position (and value) is GREATER than the searched value (implied only remaining option)
                THEN eliminate all impossible options. Last becomes middle -1. */
            }
            middle = (first + last) / 2;
        }
        if (notFound==true) {
            System.out.println("Your number is NOT in the array!");
        }





        }
}
