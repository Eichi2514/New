package codeup.UP1500.p1554;

import java.util.Scanner;

public class Main {
    private static int f(double a) {
        return (int) Math.floor(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.printf("%d", f(x));
    }
}