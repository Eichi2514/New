package codeup.UP1000.p1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double c = sc.nextFloat();
        double d = sc.nextFloat();

        double s = (((a * b * c * d) / 8) / 1024) / 1024;

        System.out.printf("%.1f MB", s);
    }
}