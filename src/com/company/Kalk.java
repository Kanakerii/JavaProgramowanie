package com.company;

import java.util.Scanner;

public class Kalk {
    public static double Dodawanie(double a, double b)
    {
        return a+b;
    }
    public static double Odejmowanie(double a, double b)
    {
        return a-b;
    }
    public static double Mnozenie(double a, double b)
    {
        if(b==0) {
            System.out.println("Mnożenie przez 0 zawsze daje 0");
        }
        return a*b;
    }
    public static double Dzielenie(double a, double b)
    {
        if(b==0 || a==0) {
            System.out.println("Nigdy holero nie dziel przez 0");
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        double no1= scan.nextDouble();
        System.out.println("Podaj znak działania jakie chcesz wykonać");
        String a=scan.next();
        System.out.println("Podaj drugą liczbę");
        double no2=scan.nextDouble();
        switch (a)
        {
            case "+":
                System.out.println(Dodawanie(no1,no2));
                break;
            case "-":
                System.out.println(Odejmowanie(no1,no2));
                break;
            case "/":
                System.out.println(Dzielenie(no1,no2));
                break;
            case "*":
                System.out.println(Mnozenie(no1,no2));
                break;
            default:
                System.out.println("Wprowadzono błędny znak");
        }


    }
}
