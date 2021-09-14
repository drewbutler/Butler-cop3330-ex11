/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int euros = myObj.nextInt();

        System.out.println("What is the exchange rate?");
        double rateOfExchange = myObj.nextDouble();

        double conversion = (rateOfExchange*euros*100)/100;

        System.out.printf("%d euros at an exchange rate of %f is %.2f U.S. dollars", euros, rateOfExchange, conversion);

        myObj.close();
    }
}