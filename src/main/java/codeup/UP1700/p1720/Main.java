package codeup.UP1700.p1720;

import java.util.Scanner;

public class Main {
    public static int test(int i, int a, int b, int c, int d) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min == d) {
            return 1;
        } else {
            System.out.println(i + " " + min);
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bool = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            bool += test(i, a, b, c, d);
        }

        if (bool == n) System.out.println(-1);
    }
}