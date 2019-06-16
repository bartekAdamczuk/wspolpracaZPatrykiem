package com.sda;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class dodawanie {
    Scanner scaner = new Scanner(System.in);
    public void dodawanie () {
        System.out.println("Podaj 1 liczbę:");
        int a = scaner.nextInt();
        System.out.println("Podaj drugą liczbę; ");
        int b = scaner.nextInt();
        System.out.println("Wynik dodawania to: " + (a + b));

    }
}
