package com.company;

import java.util.Scanner;
class Obwod
{
    boolean forma=true;
    public double obwod(double a)
    {
        a/=2;
        double wynik=0;
        if (forma)
        {
            wynik=2*3.14*a;
        }
        else
            wynik=(float) (2*Math.PI*a);
        return wynik;
    }
}
public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	    Obwod obwod=new Obwod();
	    do {
            System.out.println("Podaj średnice okręgu");
            double a = scan.nextInt();
            System.out.println("Z której formy chcesz skorzystać?");
            System.out.println("1. krótsza");
            System.out.println("2. dłuższa");
            String b = scan.next();
                switch (b) {
                    case "1":
                        obwod.forma = true;
                        break;
                    case "2":
                        obwod.forma = false;
                        break;
                    default:
                        System.out.println("Coś poszło nie tak");
                        break;

                }
            System.out.println("Obwód okręgu wynosi : " + obwod.obwod(a));

        }while(true);
    }
}
