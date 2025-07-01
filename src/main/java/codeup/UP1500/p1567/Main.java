package codeup.UP1500.p1567;

import java.util.Scanner;

public class Main {
    static int[] d = new int[1010];

    private static long subsetsum(int p, int q) {
        long c = 0;
        for (int i = p; i <= q; i++) {
            c += d[i-1];
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", subsetsum(a, b));
    }
}