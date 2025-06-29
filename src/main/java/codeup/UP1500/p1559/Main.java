package codeup.UP1500.p1559;

import java.util.Scanner;

public class Main {
    private static long f(long n, long m) {
        return n + m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        System.out.printf("%d", f(n, m));
    }
}