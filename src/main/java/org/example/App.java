package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        double adr = 0.0;
        System.out.println("Enter a 1 if you are a male, enter a 2 if you are a female");
        int gender = scnr.nextInt();

        System.out.println("How many ounces of alcohol did you have?");
        double ounces = scnr.nextDouble();

        System.out.println("What is your weight, in pounds?");
        double weight = scnr.nextDouble();

        System.out.println("How many hours has it been since your last drink?");
        double time = scnr.nextDouble();

        if(gender == 1)
        {
            adr = 0.73;
        }
        else if(gender == 2)
        {
            adr = 0.66;
        }

        double BAC = (((ounces * 5.14) / weight * adr) - (0.015 * time));

        if (BAC <= 0.08)
        {
            System.out.format("Your BAC is %f\nIt is legal for you to drive!", BAC);
        }
        else
        {
            System.out.format("Your BAC is %f\nIt is not legal for you to drive!", BAC);
        }
    }
}
