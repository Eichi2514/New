package codeup.UP1900.p1916;

import java.util.Scanner;

public class Main {
    static final int MOD = 10009;
    static int[] chk = new int[210];
    static long[] d = new long[210];

    public static long f(int k) {
        if (chk[k] == 1) return d[k];
        chk[k] = 1;
        if (k <= 2) return d[k] = 1;
        return d[k] = (f(k - 1) + f(k - 2)) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}