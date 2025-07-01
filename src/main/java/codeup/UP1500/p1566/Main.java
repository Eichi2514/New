package codeup.UP1500.p1566;

import java.util.Scanner;

public class Main {

    private static long pow(long p, long q) {
        long c = 1;
        for (int i = 0; i < q; i++) {
            c *= p;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long n = sc.nextLong();

        System.out.printf("%d", pow(a, n));
    }
}