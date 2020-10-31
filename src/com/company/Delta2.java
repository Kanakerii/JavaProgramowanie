package com.company;

import java.util.Scanner;

public class Delta2 {
    public static int delta(int a, int b, int c)
    {
     return b*b-4*a*c;

    }
    public static double[] getPierwiastki(int a,int b, double delta)
        {
            double [] results=new double[2];
            results[0]=(-b-Math.sqrt(delta))/(2*a);
            results[1]=(-b+Math.sqrt(delta))/(2*a);
            return results;
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a= scan.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b= scan.nextInt();
        System.out.println("Podaj liczbe c: ");
        int c= scan.nextInt();
        double delta=delta(a,b,c);
        if  (delta<0)
        {
            System.out.println(delta(a,b,c));
            System.out.println("Delta jest ujemna");
        }
        else {
            double[] pierwiastki = getPierwiastki(a, b, delta);
            System.out.println("Pierwszy: "+pierwiastki[0]);
            System.out.println("Drugi: "+pierwiastki[1]);
        }





    }
}
