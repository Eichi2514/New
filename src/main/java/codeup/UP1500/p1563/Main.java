package codeup.UP1500.p1563;

import java.util.Scanner;

public class Main {
    private static long min(long p, long q) {
        return Math.min(p, q);
    }

    private static long max(long p, long q) {
        return Math.max(p, q);
    }

    private static long mid(long n, long m, long x) {
        long minimum = min(n, min(m, x));
        long maximum = max(n, max(m, x));
        return n + m + x - minimum - maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long x = sc.nextLong();

        System.out.printf("%d", mid(n, m, x));
    }
}