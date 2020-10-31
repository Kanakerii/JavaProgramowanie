package com.company;

import java.util.Scanner;

public class BMI {
    public static double BMI (int a, double b)
    {
        double wzrost=(double)a/100;
        double BMI=b/(wzrost*wzrost);
        if (BMI>24.9 || BMI<18.5)
            System.out.println("BMI Nieoptymalne");
        else
            System.out.println("BMI Optymalne");
        return BMI;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj wzrost :");
        int a= scan.nextInt();
        System.out.println("Podaj wage");
        double b=scan.nextDouble();
        System.out.println(BMI(a,b));
    }
}
