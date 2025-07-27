package codeup.UP1800.p1858;

import java.util.Scanner;

public class Main {
    public static int f(int n, int r) {
        if (r == 1 || r == n) return 1;
        return f(n - 1, r - 1) + f(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(f(n, r));
    }
}