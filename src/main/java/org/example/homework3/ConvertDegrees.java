package org.example.homework3;

public class ConvertDegrees {
    public static void main(String[] args) {
        double degreeCelsius = 12.5;
        double degreeFahrenheit = (degreeCelsius * 9/5) + 32;
        double degreeKelvin = degreeCelsius + 273.15;

        System.out.println("Celsius: " + degreeCelsius);
        System.out.println("Fahrenheit: " + degreeFahrenheit);
        System.out.println("Kelvin: " + degreeKelvin);
    }
}