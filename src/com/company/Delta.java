package com.company;

import java.util.Scanner;

public class Delta {
    public static String delta(int a, int b, int c)
    {
        double delta=(b*b)-4*a*c;
        if(delta<0)
        {
            System.out.println(delta);
            return "Delta jest ujemna";
        }
        double pDelta=Math.sqrt(delta);
        double x1=(-b-pDelta)/(2*a);
        double x2=(-b+pDelta)/(2*a);
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
        return "Delta jest dodatnia";

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a= scan.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b= scan.nextInt();
        System.out.println("Podaj liczbe c: ");
        int c= scan.nextInt();
        System.out.println(delta(a,b,c));

    }
}
