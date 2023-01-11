package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to be checked : ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if ( num < 2 )
        {
            isPrime = false;
        }
        for ( int i = 2; i < num; i++)
        {
            if ( num % i == 0)
            {
                isPrime = false;
                break;
            }

        }

        String result = isPrime ? "Prime" : "not Prime";
        System.out.println ("The number " + num + " is  " + result);
    }
}
