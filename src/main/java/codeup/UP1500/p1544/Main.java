package codeup.UP1500.p1544;

import java.util.Scanner;

public class Main {
    private static void f(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }
}