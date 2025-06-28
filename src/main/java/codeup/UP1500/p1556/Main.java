package codeup.UP1500.p1556;

import java.util.Scanner;

public class Main {
    private static long f(int n) {
        long mul = 1;
        for (int i = 2; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("%d", f(n));
    }
}