package codeup.UP1100.p1127;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            sum += a * b;
        }
        System.out.printf("%.1f", sum);
    }
}