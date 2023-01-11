package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if ( sum == num ) {
            System.out.println(num + " is a perfect number");
        }else {
            System.out.println(num+" is not a perfect num");
        }
    }
}

