/* Alexander J King
9.21.19
Homework 3
CSET 3600
 */

/*  INITIAL RELEASE 0.1
Have a while x = true loop run while the user inputs their data and. Make x false when the user is done inputting data.
Count the workout types done by setting workout types = 0 and making them =1 if complete. This prevents doing 2 types of cardio as counting as 2 workout types.
I also have a count++ to track how many workouts were completed but I do not currently have this verbose.

Ask the the user what specific kind of workout was done a workout type.

Ask the user if they have more inputs (x = true and code repeats else X was made false just after the while loop started.)

If workout types done >= 2 they have completed the periods tasks (with the previous stipulation that in order for a workout to count they must have done it 3 times in the period). Else they have failed.

 */
/*
IMPROVED RELEASE 1.0 wish list / ideas:

DONE - Ask the user how long the workout period should be in days.
DONE - Ask the user to CUSTOMIZE their goals. EX: Lose X amount of pounds, complete X amount of workouts, etc. The user can input any or all but must pick at least one goal.
DONE - Iterate the prompts to ask for each days input values.
DONE - Ask the user what their initial weight was at the start of the period vs end and compare.
DONE - Implemented increased verbosity outputs for the results. Calculated weight different. (possible to lose negative pounds == gained).
        Gives "workout score" vs "number of workouts" because making something into a competitive game has been shown effective.
        workout type varity also now output to user
FIXED - possible improper workout total counting if the user input something inaccurate or out of bounds. This was due to where the program counted a new workout as actually happening.
        This has been moved to only happen when the user gives an acceptable final input.
FIXED - possible improper workout variety total if the user input something inaccurate or out of bounds. This was due to where the program counted a workout variety type as actually happening.
        This has been moved to only happen when the user gives an acceptable final input.
DONE - added output for failed workout periods. Previously the user would only get their stats if they were successful.
 */




package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean x = true;
        boolean y = true;
        int totalWorkoutsCompleted = 0;
        double initialWeight;
        int workoutType;
        int cardioType;
        int powerType;
        int enduranceType;
        int yesOrNo;
        int cardioDone = 0;
        int powerDone = 0;
        int enduranceDone = 0; // set all completion values to 0 and change to 1 upon completion.  Only values 0-3 currently possible.
        int workoutPeriod;
        int didWorkout;
        int goalType;
        double finalWeight;
        int goalWorkoutTypes = 0;
        int goalWorkoutNum = 0;
        double goalPoundsToLose = 0;
        int goalWorkoutsTotal = 0;

        // THE WORKOUT GOALS ARE THE NEXT 2 PRINT LINES
        // The user MUST do at least 2 categories of workout. The 2nd line informs them they MUST have done this specific workout 3 times in the period to totalWorkoutsCompleted.
        //System.out.println("The workout period MUST include 2 workout types from the categories Cardio, Power, and Endurance to meet the workout period goal!");
        //System.out.println("Each specific workout like: high knees, bunch pressm or walking MUST be done atleast 3 times to totalWorkoutsCompleted!");
        System.out.println("How much do you weigh in lbs at the start of your workout period?");
        initialWeight = scan.nextDouble();

        System.out.println("How many days would you like your workout period to be?");
        workoutPeriod = scan.nextInt();

        /*
         ***************************************************************************************************************
         */
        while (y = true) {
            y = false;
            System.out.println("What goals would you like to set? 1 = number of workout types, 2 = pounds lost, 3 = total workouts");
            goalType = scan.nextInt();
            if (goalType == 1) {
                System.out.println("How many workout types of out the 3 would you like to complete?");
                goalWorkoutNum = scan.nextInt();
                System.out.println("Would you like to add additional goals? 1 = yes 2 = no");
                yesOrNo = scan.nextInt();
                if (yesOrNo == 1) {
                    y = true;
                } else break;
            }
            if (goalType == 2) {
                System.out.println("How many pounds would you like to lose?");
                goalPoundsToLose = scan.nextDouble();
                System.out.println("Would you like to add additional goals? 1 = yes 2 = no");
                yesOrNo = scan.nextInt();
                if (yesOrNo == 1) {
                    y = true;
                } else break;
            }
            if (goalType == 3) {
                System.out.println("How many total workouts would you like to complete?");
                goalWorkoutsTotal = scan.nextInt();
                System.out.println("Would you like to add additional goals? 1 = yes 2 = no");
                yesOrNo = scan.nextInt();
                if (yesOrNo == 1) {
                    y = true;
                } else break;
            }
        } // end while loop goal types


        for (int workoutPeriodCounter = 1; workoutPeriodCounter <= workoutPeriod; workoutPeriodCounter++) {
            System.out.println("Did you work out on day " + workoutPeriodCounter + "? 1 = yes and 2 = no.");
            didWorkout = scan.nextInt();
            if (didWorkout == 1) {


                while (x = true) {
                    x = false;
                    System.out.println("Input a type of workout you did: ");
                    System.out.println("1 = Cardio, 2 = Power, 3 = Endurance"); // using #s instead of letters for less confusion A!=a.

                    workoutType = scan.nextInt();
                    if (workoutType <= 0 || workoutType >= 4) {
                        System.out.println("Your input was out of bounds.");
                    }


                    if (workoutType == 1) {


                        System.out.println("What kind of cardio did you do? 1 = mountian climber, 2 = high knees, 3 = planks, 4 = skaters, 5 = long jump, 6 = jump rope:");
                        cardioType = scan.nextInt();
                        if (cardioType == 1) {
                            totalWorkoutsCompleted++;
                            cardioDone = 1;
                            System.out.println("You did Mountain Climbers!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break; //number of workouts. break;

                        }
                        if (cardioType == 2) {
                            totalWorkoutsCompleted++;
                            cardioDone = 1;
                            System.out.println("You did High Knees!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1) {
                                x = true;
                            } else break;

                        }
                        if (cardioType == 3) {
                            totalWorkoutsCompleted++;
                            cardioDone = 1;
                            System.out.println("You did Planks!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1) {
                                x = true;
                            } else break;

                        }
                        if (cardioType == 4) {
                            totalWorkoutsCompleted++;
                            cardioDone = 1;
                            System.out.println("You did Skaters!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1) {
                                x = true;
                            } else break;

                        }
                        if (cardioType == 5) {
                            totalWorkoutsCompleted++;
                            cardioDone = 1;
                            System.out.println("You did Long Jumps!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1) {
                                x = true;
                            } else break;

                        }
                        if (cardioType == 6) {
                            totalWorkoutsCompleted++;
                            cardioDone = 1;
                            System.out.println("You did Jump Ropes!"); // ♪♫ SKIP ROPE SKIP ROPE♪♫ lol classic LeafyIsHere
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1) {
                                x = true;
                            } else break;

                        }
                        if (cardioType > 6 || cardioType < 1) {
                            System.out.println("Your reply is out of bounds");
                            x = true;

                        }


                    } // if workout type 1 end


                    if (workoutType == 2) {


                        System.out.println("What kind of power workout did you do? 1 = Dumbbells, 2 = Bench Press, 3 = Shoulder Lifts:");
                        powerType = scan.nextInt();
                        if (powerType == 1) {
                            totalWorkoutsCompleted++;
                            powerDone = 1;
                            System.out.println("You did Dumbbells!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break;

                        }
                        if (powerType == 2) {
                            totalWorkoutsCompleted++;
                            powerDone = 1;
                            System.out.println("You did Bench Presses!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break;

                        }
                        if (powerType == 3) {
                            totalWorkoutsCompleted++;
                            powerDone = 1;
                            System.out.println("You did Shoulder lifts!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break;


                            if (powerType > 3 || powerType < 1) {
                                System.out.println("Your reply is out of bounds");
                                x = true;

                            }

                        } /* *****CAN ADD ADDITIONAL POWER TYPES *************************************************
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


                        System.out.println("What kind of endurance workout did you do? 1 = jogging, 2 = running, 3 = walking");
                        enduranceType = scan.nextInt();
                        if (enduranceType == 1) {
                            totalWorkoutsCompleted++;
                            enduranceDone = 1;
                            System.out.println("You did jogging!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break;

                        }
                        if (enduranceType == 2) {
                            totalWorkoutsCompleted++;
                            enduranceDone = 1;
                            System.out.println("You did running!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break;

                        }
                        if (enduranceType == 3) {
                            totalWorkoutsCompleted++;
                            enduranceDone = 1;
                            System.out.println("You did walking!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break;

                        }
                        if (enduranceType == 4) {
                            totalWorkoutsCompleted++;
                            enduranceDone = 1;
                            System.out.println("You did lifting him/her off the ground!");
                            System.out.println("Did you do any other workouts? 1 = yes 2 = no");
                            yesOrNo = scan.nextInt();
                            if (yesOrNo == 1)
                                x = true;
                            else break;


                            if (enduranceType > 4 || enduranceType < 1) {
                                System.out.println("Your reply is out of bounds");
                                x = true;

                            }

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
            } // if you worked out today end

        } // for loop end
        System.out.println("What is your final weight?");
        finalWeight = scan.nextDouble();

        if (goalWorkoutsTotal <= totalWorkoutsCompleted && cardioDone + powerDone + enduranceDone >= goalWorkoutTypes && initialWeight - goalPoundsToLose >= finalWeight) {
            System.out.println("You accomplished your goals!");
            System.out.println("Your total workouts score is: " + totalWorkoutsCompleted);
            System.out.println("You initial weight  was: " + initialWeight);
            System.out.println("Your workout type variety is: " + (cardioDone + powerDone + enduranceDone));
            System.out.println("You lost " + (initialWeight - finalWeight) + "  pounds");
        }
        if (goalWorkoutsTotal > totalWorkoutsCompleted || cardioDone + powerDone + enduranceDone < goalWorkoutTypes || initialWeight - goalPoundsToLose < finalWeight) {
            System.out.println("You did NOT accomplish your goals!"); // AND YOU NEVER WILL LIKE THIS!
            System.out.println("Your total workouts score is: " + totalWorkoutsCompleted);
            System.out.println("You initial weight  was: " + initialWeight);
            System.out.println("Your workout type variety is: " + (cardioDone + powerDone + enduranceDone));
            System.out.println("You lost " + (initialWeight - finalWeight) + "  pounds");


//        if (cardioDone+powerDone+enduranceDone >=goalWorkoutNum){
//            System.out.println("You met this weeks goal! Good job");
//        }


        }
    }
}

