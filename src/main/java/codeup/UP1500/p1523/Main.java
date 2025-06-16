package codeup.UP1500.p1523;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n2s = new int[10][10];

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int count = 0;

        for (int i = c1; i <= d1; i++) {
            for (int j = c2; j <= d2; j++) {
                n2s[i][j] = 3;
            }
        }

        if (n2s[a1][a2] == 3) {
            n2s[a1][a2] = 4;
        } else {
            n2s[a1][a2] = 1;
        }

        if (n2s[a1][a2] == 4) {
            for (int i = c1; i <= d1; i++) {
                for (int j = c2; j <= d2; j++) {
                    n2s[i][j] = 2;
                }
            }
            for (int i = a1 - 2; i <= a1 + 2; i++) {
                for (int j = a2 - 2; j <= a2 + 2; j++) {
                    if (i <= 0 || i >= 10 || j <= 0 || j >= 10) {
                        continue;
                    }
                    n2s[i][j] = 2;
                }
            }
            n2s[a1][a2] = 4;
        } else {
            for (int i = a1 - 2; i <= a1 + 2; i++) {
                for (int j = a2 - 2; j <= a2 + 2; j++) {
                    if (i <= 0 || i >= 10 || j <= 0 || j >= 10) {
                        continue;
                    }
                    if (n2s[i][j] == 3) {
                        continue;
                    }
                    n2s[i][j] = 2;
                }
            }
            n2s[a1][a2] = 1;
        }

        for (int i = b1 - 2; i <= b1 + 2; i++) {
            for (int j = b2 - 2; j <= b2 + 2; j++) {
                if (i <= 0 || i >= 10 || j <= 0 || j >= 10) {
                    continue;
                }
                if (n2s[i][j] == 1 || n2s[i][j] == 4) {
                    System.out.println("0");
                    return;
                }
            }
        }

        n2s[b1][b2] = 5;
        for (int i = b1 - 2; i <= b1 + 2; i++) {
            for (int j = b2 - 2; j <= b2 + 2; j++) {
                if (i <= 0 || i >= 10 || j <= 0 || j >= 10) {
                    continue;
                }
                n2s[i][j] = 7;
            }
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (n2s[i][j] == 2) count++;
            }
        }

        System.out.println(count + 1);
    }
}