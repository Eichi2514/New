package codeup.UP1400.p1469;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int tmp = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = tmp++;
                }
            }
            else {
                for (int j = n - 1; j >= 0; j--) {
                    a[i][j] = tmp++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}