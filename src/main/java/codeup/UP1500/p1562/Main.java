package codeup.UP1500.p1562;

import java.util.Scanner;

public class Main {
    private static long f(long n, long m) {
        return Math.min(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.printf("%d", f(n, m));
    }
}