package com.company;

import java.util.Scanner;

public class Fibbonaci {
    public static int Fibo(int a)
    {
        int l=1;
        int p=1;
        for (int i = 2; i <=a ; i++) {
          int temp=l+p;
          l=p;
          p=temp;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj która liczba Fibbonaciego z kolei ma być wyświetlona");
        int a= scan.nextInt();
        System.out.println(Fibo(a));


    }
}
