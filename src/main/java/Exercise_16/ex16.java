/*
 * UCF COP 3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
If the user is sixteen or older, then the program should display
"You are old enough to legally drive." If the user is under sixteen,
the program should display "You are not old enough to legally drive."

Example Output
What is your age? 15
You are not old enough to legally drive.
Or
What is your age? 35
You are old enough to legally drive.

Constraints
Use a single output statement.
Use a ternary operator to write this program.
If your language doesn’t support a ternary operator, use a regular if/else statement,
 and still use a single output statement to display the message.

 */

package Exercise_16;

import java.util.Scanner;
public class ex16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");

        int age = input.nextInt();

        String drive = age >= 16
                ? "\nYou are old enough to legally drive"
                : "\nYou are not old enough to legally drive";

        System.out.println(drive);
    }
}
