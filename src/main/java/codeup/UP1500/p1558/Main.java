package codeup.UP1500.p1558;

import java.util.Scanner;

public class Main {
    private static long f(long n) {
        long re = 0;
        while (n != 0) {
            re = re * 10 + n % 10;
            n /= 10;
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.printf("%d", f(n));
    }
}