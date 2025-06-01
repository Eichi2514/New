package codeup.UP1400.p1479;

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

        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}