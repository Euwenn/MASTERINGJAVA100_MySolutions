import java.util.Scanner;

/*
Mastering Java 100+ All Solutions.
Name: Euwen
Date: September 8th, 2025

Problem 2: Write a program that calculates the arithmetic mean of two numbers
 */
public class MJ_Sol2
{
    public static void main(String[] args)
    {
        //Create a scanner
        Scanner sc = new Scanner(System.in);

        //Take user input for two numbers
        System.out.println("Please enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();

        //Calculate the arithmetic mean of two numbers
        double mean = (num1 + num2) / 2;

        //Display the number back to the user
        System.out.println("The arithmetic mean of your numbers are:  " + mean);

        //Close the scanner
        sc.close();
    }
}
