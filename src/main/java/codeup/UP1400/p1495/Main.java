package codeup.UP1400.p1495;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] d = new int[n][m];

        for (int i = 0; i < k; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int u = sc.nextInt();

            if (x1 < n && y1 < m) d[x1][y1] += u;
            if (x2 + 1 < n && y2 + 1 < m) d[x2 + 1][y2 + 1] += u;
            if (x1 < n && y2 + 1 < m) d[x1][y2 + 1] -= u;
            if (x2 + 1 < n && y1 < m) d[x2 + 1][y1] -= u;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0) d[i][j] += d[i - 1][j];
                if (j > 0) d[i][j] += d[i][j - 1];
                if (i > 0 && j > 0) d[i][j] -= d[i - 1][j - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}