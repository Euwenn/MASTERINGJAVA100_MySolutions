import java.util.Scanner;

/*
Mastering Java 100+ All Solutions.
Name: Euwen
Date: September 8th, 2025

Problem 3: Create a program that calculates and displays the arithmetic mean of
three grades entered by the user.
 */
public class MJ_Sol3
{
    public static void main(String[] args)
    {
        //Create a scanner
        Scanner sc = new Scanner(System.in);

        //Take user input for the three grades
        System.out.println("Please enter the first grade: ");
        double grade1 = sc.nextDouble();

        System.out.println("Please enter the second grade: ");
        double grade2 = sc.nextDouble();

        System.out.println("Please enter the third grade: ");
        double grade3 = sc.nextDouble();

        //Calculate the arithmetic mean of the three grades
        double gradeMean = (grade1 + grade2 + grade3) / 3;

        //Display to the user
        System.out.println("The mean of your three grades are: " + gradeMean);

        //Close scanner
        sc.close();

    }
}