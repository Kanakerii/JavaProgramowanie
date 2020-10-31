package com.company;

import java.util.Scanner;

public class PifPaf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int a = scan.nextInt();
        for (int i = 0; i <= a; i++) {
            if(i%21==0)
                System.out.println("PifPaf");
            else if(i%7==0)
                System.out.println("Paf");
            else if(i%3==0)
                System.out.println("Pif");
                else
                System.out.println(i);

        }
    }
}