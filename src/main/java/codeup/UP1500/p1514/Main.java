package codeup.UP1500.p1514;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] n2s = new int[7][7];
        int[][] XYs = new int[3][2];

        for (int i = 0; i < 3; i++) {
            XYs[i][0] = sc.nextInt() - 1;
            XYs[i][1] = sc.nextInt() - 1;
        }


        for (int i = 0; i < 7; i++) {
            n2s[3][i] = 1;
        }

        for (int[] s : XYs) {
            if (s[0] == 3) {
                for (int i = 0; i < 7; i++) {
                    n2s[i][s[1]] = 1;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int[] ns : XYs) {
                int x = ns[0];
                int y = ns[1];
                if (n2s[x][y] == 1) {
                    for (int j = 0; j < 7; j++) {
                        n2s[x][j] = 1;
                        n2s[j][y] = 1;
                    }
                }
            }
        }

        for (int[] ns : XYs) {
            n2s[ns[0]][ns[1]] = 2;
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(n2s[i][j] + " ");
            }
            System.out.println();
        }
    }
}