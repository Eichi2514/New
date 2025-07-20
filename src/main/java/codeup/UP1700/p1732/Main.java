package codeup.UP1700.p1732;

import java.util.Scanner;

public class Main {
    public static double square(double a, double b) {
        double sum = a;
        for (int i = 2; i <= b; i++) {
            sum *= a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%.1f\n", a / b);
        System.out.printf("%d\n", (int) (a / b));
        System.out.printf("%d\n", (int) square(a, b));
    }
}