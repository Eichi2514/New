package codeup.UP1400.p1488;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];

        int tmp = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = right; i >= left; i--) {
                a[bottom][i] = tmp++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                a[i][left] = tmp++;
            }
            left++;

            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    a[top][i] = tmp++;
                }
                top++;
            }

            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    a[i][right] = tmp++;
                }
                right--;
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