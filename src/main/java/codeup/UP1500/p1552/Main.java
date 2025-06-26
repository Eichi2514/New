package codeup.UP1500.p1552;

import java.util.Scanner;

public class Main {
    private static double f(double a) {
        return a % 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.printf("%.14f", f(x));
    }
}