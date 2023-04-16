/*
This program gets two numbers from user
And gets random number between them
Changes it to integer
Then prints it out to the user
This is repeated forever unless user inserts letter
This triggers exception and closes program
*/

package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ----!!!THIS IS FINAL VERSION!!!----

        // Objects
        Scanner sc = new Scanner(System.in);

        // Variables
        int min;
        int max;
        int sum2;
        double sum;

        // Welcomes user
        System.out.println("""
                Hello user, insert 2 numbers and program will pick a random number in that range
                If you want to exit press any letter
                """);

        // Checking if user inserted integer if not -> break
        try {

            // Loop
            for (; ; ) {
                // Asks for lowest number
                System.out.print("What lower-bound should be? ");
                min = sc.nextInt();

                // Asks for biggest number
                System.out.print("What upper-bound should be? ");
                max = sc.nextInt();

                // Checks if bigger number isn't lower than lower one
                if ((max <= min || min >= max) || (min <= 0 || max <= 0)){
                    System.out.println("Wrong numbers!\n");
                    continue;
                }

                // Checks if numbers aren't equal
                if (max != min) {

                    // Generates random number
                    sum = Math.random() * (max - min + 1);

                    // Changes that number to integer
                    sum2 = (int) Math.round(sum);

                    // Checks if numbers are correct
                    if (sum2 < min)
                        sum2 += min;

                    // Checks if numbers are correct
                    if (sum2 > max)
                        sum2 -= max;
                }else {
                    sum2 = min;
                }

                // Prints out random number
                System.out.println("Random number is: " + sum2);

                // Prints out clear line for better reading
                System.out.println();

            }
        }catch(InputMismatchException e){
            System.out.println("Closing program");
        }
    }
}