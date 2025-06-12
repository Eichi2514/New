package codeup.UP1500.p1510;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] magic = new int[n][n];

        int number = 1;
        int row = 0;
        int col = n / 2;

        while (number <= n * n) {
            magic[row][col] = number;

            if (number % n == 0) {
                row = (row + 1) % n;
            } else {
                row = (row - 1 + n) % n;
                col = (col + 1) % n;
            }

            number++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }
    }
}