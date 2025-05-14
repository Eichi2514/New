package codeup.UP1300.p1371;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 2;
        int m = n - 1;

        for (int i = 1; i <= n * 2; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= s; j++) {
                if (j == 1 || j == s) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i < n) {
                m--;
                s += 2;
            } else if (i > n) {
                m++;
                s -= 2;
            }
            System.out.println();
        }
    }
}