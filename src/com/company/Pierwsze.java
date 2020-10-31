package com.company;

import java.util.Scanner;

public class Pierwsze {
    public static boolean isPrimalNumber(int n)
    {
        for (int i=2;i<n;i++)
            if(n%i==0) return false;

            return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scan.nextInt();
        for (int i = 2; i < a; i++) {
            if(isPrimalNumber(i))
                System.out.println(i);

        }
    }
}

