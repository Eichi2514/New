package codeup.UP1000.p1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextFloat();
        double h = sc.nextFloat();
        double b = sc.nextFloat();

        double q = (((w * h * b) / 8) / 1024) / 1024;

        System.out.printf("%.2f MB", q);
    }
}