package codeup.UP1500.p1513;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        int num = 1;

        for (int i = 0; i <= 2 * (n - 1); i++) {
            boolean b = (n % 2 == 0) == (i % 2 != 0);

            if (b) {
                for (int j = n - 1; j >= 0; j--) {
                    int k = i - j;
                    if (k < 0 || k >= n) continue;
                    if (j + k >= n - 1) map[j][k] = num++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    int k = i - j;
                    if (k < 0 || k >= n) continue;
                    if (j + k >= n - 1) map[j][k] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}