package codeup.UP1500.p1516;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[][] n2s = new int[a][b];
        int[][] n2s2 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                n2s[i][j] = sc.nextInt();
            }
        }

        int[] d = {-1, 0, 1};


        int k = sc.nextInt();


        for (int q = 0; q < k; q++) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    int count = 0;

                    for (int di : d) {
                        for (int dj : d) {
                            if (di == 0 && dj == 0) continue;
                            int ni = i + di;
                            int nj = j + dj;
                            if (ni >= 0 && ni < a && nj >= 0 && nj < b && n2s[ni][nj] == 1) {
                                count++;
                            }
                        }
                    }

                    if (n2s[i][j] == 0 && count == x) {
                        n2s2[i][j] = 1;
                    } else if (n2s[i][j] == 1 && (count < y || count >= z)) {
                        n2s2[i][j] = 0;
                    } else {
                        n2s2[i][j] = n2s[i][j];
                    }
                }
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    n2s[i][j] = n2s2[i][j];
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(n2s[i][j] + " ");
            }
            System.out.println();
        }
    }
}