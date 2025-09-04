import java.util.Scanner;
/*
Mastering Java 100+ All Solutions.
Name: Euwen
Date: September 4th, 2025

Problem 1: Write a program that prompts the user for two numbers and displays the addition, subtraction, multiplication,-
and division between them.
 */
public class MJ_Sol1
{
    public static void main(String[] args)
    {
        //Create scanner object
        Scanner sc = new Scanner(System.in);

        //Get first number from user
        System.out.print("Please enter the first number: ");
        double num1 = sc.nextDouble();

        //Get second number from user
        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();

        //Variables
        double add = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;

        //Compute and displays the numbers to the user
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);

        //Close scanner
        sc.close();
    }
}