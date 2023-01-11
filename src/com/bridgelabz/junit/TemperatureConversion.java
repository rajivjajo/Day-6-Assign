package com.bridgelabz.junit;

import java.util.Scanner;

public class TemperatureConversion {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter temperature in celsius : ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit.");
    }
}
