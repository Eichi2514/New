package codeup.UP1000.p1097;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, x, y;
        int[][] a = new int[19][19];

        for (i = 0; i < 19; i++) {
            for (j = 0; j < 19; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            for (j = 0; j < 19; j++) {
                if (a[x - 1][j] == 0) a[x - 1][j] = 1;
                else a[x - 1][j] = 0;
                if (a[j][y - 1] == 0) a[j][y - 1] = 1;
                else a[j][y - 1] = 0;
            }
        }
        for (i = 0; i < 19; i++) {
            for (j = 0; j < 19; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}