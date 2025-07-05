package codeup.UP1600.p1602;

import java.util.Scanner;

public class Main {

    public static double ABS(double n) {
        if (n >= 0)
            return n;
        else
            return -n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        System.out.printf("%s\n", String.format("%f", ABS(n)).replaceAll("\\.?0*$", ""));
    }
}