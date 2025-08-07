package codeup.UP1900.p1960;

import java.util.Scanner;

public class Main {
    public static long sum(int n) {
        if (n == 0) return 0;
        return ((long) n * (n + 1)) / 2 + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result = sum(n);
        System.out.println(result % 137);
    }
}