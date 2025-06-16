package codeup.UP1500.p1524;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n2s = new int[9][9];
        int count = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                n2s[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        if (n2s[r][c] == 1) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (r - 1 + i >= 0 && r - 1 + i < 9 && c - 1 + j >= 0 && c - 1 + j < 9 && n2s[r - 1 + i][c - 1 + j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}