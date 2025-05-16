package codeup.UP1000.p1098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] a = new int[w][h];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                a[i][j] = 0;
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < l; j++) {
                a[x - 1][y - 1] = 1;
                if (d != 0) {
                    x++;
                } else if (d == 0) {
                    y++;
                }
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}