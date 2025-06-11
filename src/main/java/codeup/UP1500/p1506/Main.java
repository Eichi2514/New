package codeup.UP1500.p1506;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        int tmp = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = top; i <= bottom; i++) {
                a[i][left] = tmp++;
            }
            left++;

            for (int i = left; i <= right; i++) {
                a[bottom][i] = tmp++;
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    a[i][right] = tmp++;
                }
                right--;
            }

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    a[top][i] = tmp++;
                }
                top++;
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