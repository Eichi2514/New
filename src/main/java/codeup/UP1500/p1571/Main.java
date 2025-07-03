package codeup.UP1500.p1571;

import java.util.Scanner;

public class Main {
    private static long findi(int p, int[] d) {
        for (int i = 1; i < d.length; i++) {
            if (d[i] > p) return i;
        }
        return d.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];

        for (int i = 0; i < n; i++) {
            d[i + 1] = sc.nextInt();
        }

        int a = sc.nextInt();

        System.out.printf("%d", findi(a, d));
    }
}