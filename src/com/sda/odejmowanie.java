package com.sda;

import java.util.Scanner;

public class odejmowanie {
    Scanner scaner = new Scanner(System.in);
    public void odejmowanie () {
        System.out.println("Podaj 1 liczbę:");
        int a =scaner.nextInt();
        System.out.println("Podaj drugą liczbę; ");
        int b=scaner.nextInt();
        System.out.println("Wynik odejmowania to: " +(a-b));

    }
}
