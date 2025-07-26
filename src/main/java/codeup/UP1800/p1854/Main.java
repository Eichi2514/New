package codeup.UP1800.p1854;

import java.util.Scanner;

public class Main {
    public static long f(long n) {
        if (n == 0) return 0;
        return (n % 10) + f(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(f(n));
    }
}
