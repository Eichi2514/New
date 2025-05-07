package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmps = sc.nextLine().split(" ");
        int n = Integer.parseInt(tmps[0]);
        int k = Integer.parseInt(tmps[1]);
        boolean d = tmps[2].equals("L");

        for (int i = 1; i <= n; i++) {
            if (d) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}