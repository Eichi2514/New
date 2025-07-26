package codeup.UP1800.p1855;

import java.util.Scanner;

public class Main {
    public static long f(long n) {
        if (n <= 2) return 1;
        return f(n - 2) + f(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(f(n));
    }
}