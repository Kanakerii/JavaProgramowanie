package com.company;

import java.util.Scanner;

public class kolo {
    public static double ObliczObwod(float a,boolean version)
    {
        double obwod;
        if (version)
            obwod=2*Math.PI*(a/2);
        else
            obwod=2*3.14*(a/2);
        return obwod;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj promien okręgu: ");
        float a=scan.nextFloat();
        System.out.println(ObliczObwod(a,true));
        System.out.println(ObliczObwod(a,false));

    }
}
