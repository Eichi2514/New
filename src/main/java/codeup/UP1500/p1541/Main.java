package codeup.UP1500.p1541;

import java.util.Scanner;

public class Main {
    private static void f(int n) {
        String tmp = "zero";
        if (n < 0) {
            tmp = "negative";
        } else if (n > 0) {
            tmp = "positive";
        }
        System.out.printf(tmp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }
}