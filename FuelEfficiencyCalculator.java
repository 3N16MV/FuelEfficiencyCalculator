//Programmer Alexis Lariviere
//ID: 900647089
//Module 1 Assignment Problem 1
//Email Address: t.lariviere7089@student.nu.edu
//Class: CSC262

import java.util.Scanner; //Importing the Scanner class to read user input.
import java.text.DecimalFormat; //Importing the DecimalFormat class to format output to exactly two decimal places.

public class FuelEfficiencyCalculator { //Serves as the starting point for the program. Class and file name must match.
    public static void main(String[] args) { //Main method tellsw the computer where to start executing the program.
        System.out.println("This program calculates the fuel efficiency of a vehicle in miles per gallon (MPG) and how far your car can travel with a full tank of gas."); //Prints a message to the console explaining the purpose of the program to the user.

    Scanner input = new Scanner(System.in); //Creates a new Scanner object to read user input.

    System.out.print("Please enter the number of gallons of gas your car can hold rounded to the nearest whole number: "); //Prompts the user to enter the number of gallons of gas their car can hold rounded to the nearest whole number.
    double gallons = input.nextDouble(); //Reads the user input for the number of gallons of gas their car can hold and stores it in a variable (floating-point number).

    System.out.print("Please enter the fuel efficiency of your car in miles per gallon (MPG) rounded to the nearest whole number: "); //Prompts the user to enter the fuel efficiency of their car in miles per gallon (MPG) rounded to the nearest whole number.
    double mpg = input.nextDouble(); //Reads the user input for the fuel efficiency of their car in miles per gallon (MPG) and stores it in a variable (floating-point number).

    System.out.print("Please enter the price of gas per gallon in dollars to the nearest hundredth cent (two decimal places): "); //Prompts the user to enter the price of gas per gallon in dollars to the nearest hundredth cent (two decimal places).
    double pricePerGallon = input.nextDouble(); //Reads the user input for the price of gas per gallon and stores it in a variable (floating-point number).

    double costPer100Miles = (100 / mpg) * pricePerGallon; //Calculates the cost to drive 100 miles based on the fuel efficiency and price of gas per gallon.
    int distanceWithFullTank = (int) (gallons * mpg); //Calculates the distance the car can travel with a full tank of gas based on the number of gallons and fuel efficiency.

    DecimalFormat df = new DecimalFormat("0.00"); //Creates a new DecimalFormat object to format the output to exactly two decimal places for monetary values.

    System.out.println("The cost to drive 100 miles is: $" + df.format(costPer100Miles)); //Prints the cost to drive 100 miles formatted to two decimal places.
    System.out.println("The distance your car can travel with a full tank of gas is: " + distanceWithFullTank + " miles."); //Prints the distance the car can travel with a full tank of gas.

    input.close(); //Closes the Scanner object to prevent resource leaks.
    } //End of main method.
} //End of FuelEfficiencyCalculator class.