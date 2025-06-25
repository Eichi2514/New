package codeup.UP1500.p1549;

import java.util.Scanner;

public class Main {
    private static long abs(long a) {
        return (a < 0) ? -a : a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(abs(n));
    }
}