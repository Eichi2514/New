package codeup.UP1800.p1857;

import java.util.Scanner;

public class Main {
    public static int f(int n, int r) {
        if (r == 0 || n == r) return 1;
        if (n < r) return 0;
        return f(n - 1, r - 1) + f(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(f(n, r));
    }
}