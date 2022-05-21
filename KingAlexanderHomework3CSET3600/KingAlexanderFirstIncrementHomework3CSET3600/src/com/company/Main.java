/* Alexander J King
9.21.19
Homework 3
CSET 3600
 */

/*
Have a while x = true loop run while the user inputs their data and. Make x false when the user is done inputting data.
Count the workout types done by setting workout types = 0 and making them =1 if complete. This prevents doing 2 types of cardio as counting as 2 workout types.
I also have a count++ to track how many workouts were completed but I do not currently have this verbose.

Ask the the user what specific kind of workout was done a workout type.

Ask the user if they have more inputs (x = true and code repeats else X was made false just after the while loop started.)

If workout types done >= 2 they have completed the weeks tasks (with the previous stipulation that in order for a workout to count they must have done it 3 times in the period). Else they have failed.

 */




package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean x;
        int count =0;
        double weight;
        int workoutType;
        int cardioType;
        int powerType;
        int enduranceType;
        int yesOrNo;
        int cardioDone = 0;
        int powerDone = 0;
        int enduranceDone = 0;

        // THE WORKOUT GOALS ARE THE NEXT 2 PRINT LINES
        // The user MUST do at least 2 categories of workout. The 2nd line informs them they MUST have done this specific workout 3 times in the period to count.
        System.out.println("The workout period MUST include 2 workout types from the categories Cardio, Power, and Endurance to meet the workout period goal!");
        System.out.println("Each specific workout like: high knees, bunch pressm or walking MUST be done atleast 3 times to count!");
        System.out.println("How much do you weigh?");
        weight = scan.nextDouble();



        while (x = true){
            x = false;
            System.out.println("Input a type of workout you did: "); System.out.println("1 = Cardio, 2 = Power, 3 = Endurance"); // using #s instead of letters for less confusion A!=a.

            workoutType = scan.nextInt();
            if (workoutType <= 0 || workoutType >=4){
                System.out.println("Your input was out of bounds.");
            }else  count++; //number of workouts.


            if (workoutType == 1) {
                cardioDone = 1;


                System.out.println("What kind of cardio did you do? 1 = mountian climber, 2 = high knees, 3 = planks, 4 = skaters, 5 = long jump, 6 = jump rope:");
                cardioType = scan.nextInt();
                if (cardioType == 1) {
                    System.out.println("You did Mountain Climbers!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (cardioType == 2) {
                    System.out.println("You did High Knees!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (cardioType == 3) {
                    System.out.println("You did Planks!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (cardioType == 4) {
                    System.out.println("You did Skaters!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (cardioType == 5) {
                    System.out.println("You did Long Jumps!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (cardioType == 6) {
                    System.out.println("You did Jump Ropes!"); // ♪♫ SKIP ROPE SKIP ROPE♪♫ lol classic LeafyIsHere
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }


            } // if workout type 1 end


            if (workoutType == 2) {
                powerDone = 1;


                System.out.println("What kind of power workout did you do? 1 = Dumbbells, 2 = Bench Press, 3 = Shoulder Lifts:");
                powerType = scan.nextInt();
                if (powerType == 1) {
                    System.out.println("You did Dumbbells!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (powerType == 2) {
                    System.out.println("You did Bench Presses!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (powerType == 3) {
                    System.out.println("You did Shoulder lifts!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                } /* *****CAN ADD ADDITIONAL POWER TYPES *******
                if (powerType == 4) {
                    System.out.println("You did Skaters!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (powerType == 5) {
                    System.out.println("You did Long Jumps!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (powerType == 6) {
                    System.out.println("You did Jump Ropes!"); // ♪♫ SKIP ROPE SKIP ROPE♪♫ lol classic LeafyIsHere
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }*/


            } // if workout type 2 end


            if (workoutType == 3) {
                enduranceDone = 1;


                System.out.println("What kind of endurance workout did you do? 1 = jogging, 2 = running, 3 = walking");
                enduranceType = scan.nextInt();
                if (enduranceType == 1) {
                    System.out.println("You did jogging!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (enduranceType == 2) {
                    System.out.println("You did running!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (enduranceType == 3) {
                    System.out.println("You did walking!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (enduranceType == 4) {
                    System.out.println("You did lifting him/her off the ground!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                } /* **********MORE ENDURANCE CAN BE ADDED **************************
                if (enduranceType == 5) {
                    System.out.println("You did Long Jumps!");
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                }
                if (enduranceType == 6) {
                    System.out.println("You did Jump Ropes!"); // ♪♫ SKIP ROPE SKIP ROPE♪♫ lol classic LeafyIsHere
                    System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                    yesOrNo = scan.nextInt();
                    if (yesOrNo == 1)
                        x = true;
                    else break;

                } */


            } // if workout type 3 end






        } // while loop end
        System.out.println("Your workout score is: " + count);
        System.out.println("You weight is: " + weight);

        if (cardioDone+powerDone+enduranceDone >=2){
            System.out.println("You met this weeks goal! Good job");
        } else System.out.println("You did not meet this weeks goal"); //and will NEVER be fit if this continues!





    }
}
