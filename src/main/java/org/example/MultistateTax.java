package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class MultistateTax
{
    public static void main( String[] args )
    {
        // Program to calculate total order amount depending on state
        double tax_rate;
        String prompt = "";

        Scanner num_input = new Scanner(System.in);
        Scanner str_input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double subtotal = num_input.nextDouble();

        System.out.print("What state do you live in? ");
        String state = str_input.nextLine().toUpperCase();

        System.out.print("What county do you live in? ");
        String county = str_input.nextLine().toUpperCase();

        tax_rate = getTax(state, county) * subtotal;
        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax_rate, tax_rate + subtotal);
    }

    // Program to calculate tax based on location
    public static double getTax(String state, String county)
    {
        double tax_rate = 0.0;
        if (state.equals("WI") || state.equals("WISCONSIN"))
        {
            tax_rate = 0.05;
            if (county.equals("EU CLAIRE"))
                tax_rate += 0.005;
            if(county.equals("DUNN"))
                tax_rate += 0.004;
        }

        if (state.equals("IL") || state.equals("ILLINOIS"))
            tax_rate = 0.08;

        return tax_rate;
    }

}
