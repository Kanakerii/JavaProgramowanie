package com.company;

import java.util.Scanner;

public class SumaDoI {
    public static double Suma(int a)
    {
        double wynik = 0;
        for (double i = 1; i <=a; i++) {
            wynik= wynik+(1/i);
        }
        return wynik;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczbę szeregów:");
        int a= scan.nextInt();
        System.out.println(Suma(a));


    }
}
