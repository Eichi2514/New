package codeup.UP1500.p1580;

import java.util.Scanner;

public class Main {
    private static double circle(int r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.2f",circle(r));
    }
}