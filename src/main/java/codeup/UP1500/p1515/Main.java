package codeup.UP1500.p1515;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 25;
        int[][] n2s = new int[size][size];
        int[][] n2s2 = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                n2s[i][j] = sc.nextInt();
            }
        }

        int[] d = {-1, 0, 1};

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int count = 0;

                for (int di : d) {
                    for (int dj : d) {
                        if (di == 0 && dj == 0) continue;
                        int ni = i + di;
                        int nj = j + dj;
                        if (ni >= 0 && ni < size && nj >= 0 && nj < size && n2s[ni][nj] == 1) {
                            count++;
                        }
                    }
                }

                if (n2s[i][j] == 0 && count == 3) {
                    n2s2[i][j] = 1;
                } else if (n2s[i][j] == 1 && (count < 2 || count > 3)) {
                    n2s2[i][j] = 0;
                } else {
                    n2s2[i][j] = n2s[i][j];
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(n2s2[i][j] + " ");
            }
            System.out.println();
        }
    }
}