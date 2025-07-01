package codeup.UP1500.p1565;

import java.util.Scanner;

public class Main {

    private static long gcd(long p, long q) {
        if (p == 0) return q;
        return gcd(q % p, p);
    }

    private static long lcm(long p, long q) {
        return p * q / gcd(p, q);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.printf("%d", lcm(a, b));
    }
}