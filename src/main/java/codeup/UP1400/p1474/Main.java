package codeup.UP1400.p1474;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int tmp = 1;

        for (int i = m - 1; i >= 0; i--) {
            if (m % 2 == 0 && i % 2 == 0 || m % 2 != 0 && i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    a[j][i] = tmp++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    a[j][i] = tmp++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}