package com.pluralsight;

import java.util.Scanner;

        public class Calculator2 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

//INPUTS:
                System.out.println("Enter Initial Deposit Amount:");
                double depo = input.nextDouble();

                System.out.println("Enter Annual Interest Rate:");
                double inter = input.nextDouble();

                System.out.println("Enter number of years:");
                double years = input.nextDouble();

//      THE MATH:
                // Turn the interest into a decimal (no 'double' needed since it already exists)
                inter = inter / 100;

                // Your Base logic: (1 + (r / 365))
                double b = (1 + (inter / 365));

                // Your Exponent logic: (365 * t)
                double e = (365 * years);

                // Putting it all together: FV = P * (b^e)
                double futureValue = depo * Math.pow(b, e);

                // Total Interest = FV - P
                double totalInterestEarned = futureValue - depo;

//      OUTPUT SECTION:
                System.out.printf("Ending Balance: $%.2f%n", futureValue);
                System.out.printf("Total Interest Earned: $%.2f%n", totalInterestEarned);

            } // This closing brace MUST stay at the very end!
        }

