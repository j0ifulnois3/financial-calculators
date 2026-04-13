package com.pluralsight;

import java.util.Scanner;

public class calculator1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        INPUT SECTION:
        System.out.println("Enter Loan Amount (Principal):");
        double p = input.nextDouble();

        System.out.println("Enter Annual Interest Rate:");
        double r = input.nextDouble();

        System.out.println("Enter Loan Term in Years:");
        double years = input.nextDouble();

//        MATH SECTION:
//        Monthly rate:
       double i = r/ 12;
//       Total Months:
       double n = years * 12;
       double power = Math.pow(1+i,n);
       double m = p*(i *power)/ (power-1);
       double totalinterest = (m*n)-p;

//       OUTPUT SECTION;
        System.out.printf("Monthly Payment:$%.2f%n",m);
        System.out.printf("Total Interest: $%.2f%n", totalinterest);




    }
}
