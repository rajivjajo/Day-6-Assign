package com.bridgelabz.logicalprogram;

public class ReverseNum {
   static int num = 12345;
   static int reverse = 0;
    public static void main(String[] args) {

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println("The reverse of " + num + " is: " + reverse);
    }
}
