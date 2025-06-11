package codeup.UP1500.p1508;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] n2s = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            n2s[i][1] = sc.nextInt();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                n2s[i][j] = n2s[i][j - 1] - n2s[i - 1][j - 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n2s[i][j] + " ");
            }
            System.out.println();
        }
    }
}