package codeup.UP1500.p1542;

import java.util.Scanner;

public class Main {
    private static void f(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("composite");
                return;
            }
        }
        System.out.println("prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }
}