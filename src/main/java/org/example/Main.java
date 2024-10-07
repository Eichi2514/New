package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        double m = sc.nextDouble();
        double n = (k - 100) * 0.9;
        double bmi = (m - n) * 100 / n;
        if (bmi <= 10) System.out.println("정상");
        else if (bmi > 20) System.out.println("비만");
        else System.out.println("과체중");
    }
}