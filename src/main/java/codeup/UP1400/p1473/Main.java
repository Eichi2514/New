package codeup.UP1400.p1473;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int tmp = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (n % 2 == 0 && i % 2 != 0 || n % 2 != 0 && i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = tmp++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    a[i][j] = tmp++;
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