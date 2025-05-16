package codeup.UP1000.p1045;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.printf("%.0f\n", a + b);
        System.out.printf("%.0f\n", a - b);
        System.out.printf("%.0f\n", a * b);
        System.out.printf("%.0f\n", a / b);
        System.out.printf("%.0f\n", a % b);
        System.out.printf("%.2f", a / b);
    }
}