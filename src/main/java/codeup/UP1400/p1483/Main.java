package codeup.UP1400.p1483;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int tmp = 1;

        for (int i = 0; i < n + m - 1; i++) {
            for (int j = 0; j <= i; j++) {
                int k = i - j;
                if (k >= 0 && k < n && j < m) {
                    a[k][j] = tmp++;
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}