package baekjoon.LV1.p5_1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double c;
        if (a == 0 && b == 0) {
            c = 0;
        } else {
            c = a / b;
        }
        System.out.print(c);
    }
}