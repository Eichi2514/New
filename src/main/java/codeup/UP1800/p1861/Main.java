package codeup.UP1800.p1861;

import java.util.Scanner;

public class Main {

    public static int c(int n, int k) {
        if (k == 0 || k == n) return 1;
        return c(n - 1, k - 1) + c(n - 1, k);
    }

    public static void p(int row, int col) {
        if (col > row) return;
        System.out.print(c(row, col) + " ");
        p(row, col + 1);
    }

    public static void f(int currentRow, int n) {
        if (currentRow >= n) return;
        p(currentRow, 0);
        System.out.println();
        f(currentRow + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(0, n);
    }
}