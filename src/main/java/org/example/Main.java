package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        for (double i = a; i <= b; i += 0.01) {
            System.out.printf("%.02f ", i);
        }
    }
}