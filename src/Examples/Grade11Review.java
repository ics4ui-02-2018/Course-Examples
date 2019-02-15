/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class Grade11Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Printing Strings to the console
        System.out.print("Lamont ");
        System.out.println("Hello world");

        // Scanner for system input
        Scanner input = new Scanner(System.in);

        // Scans in the users name
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Welcome " + name);

        // calculate age
        System.out.println("Please enter the year you were born");
        int birthYear = input.nextInt();
        int age = 2019 - birthYear;
        System.out.println("You are " + age + " years old!");

        // if statement for old people
        if (age >= 30) {
            System.out.println("Man you are old!");
        } else if (age >= 20) {
            System.out.println("Nice...");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("I don't know");
        }

        // clearing buffer from the int to String
        input.nextLine();
        System.out.println("Please enter your name again");
        String name2 = input.nextLine();

        // get the users mark and calculate the average
        double[] marks = new double[5];
        marks[0] = 85.5;

        System.out.println("Please enter a mark on seperate lines");
        for (int i = 0; i < marks.length; i = i + 1) {
            // scanning a mark into an array spot
            marks[i] = input.nextDouble();
        }

        // accumulator for the total amount of marks
        double total = 0;
        // make a while loop like a for loop
        int spot = 0;
        while (spot < marks.length) {
            // add mark into total
            total = total + marks[spot];
            // moving spot ahead by 1
            spot++;
        }

        double average = total / marks.length;
        System.out.println("The average mark is " + average);

        // math functions in Math class
        double squareRootAvg = Math.sqrt(average);
        double maxMark = Math.max(marks[0], marks[1]);
        
        name = name.toUpperCase();
        // compare Strings
        if(name.equals("LAMONT")){
            System.out.println("Hi master!");
        }
        
    }
}
