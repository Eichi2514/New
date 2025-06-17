package codeup.UP1500.p1525;

import java.util.Scanner;

public class Main {
    static int[][] n2s = new int[10][10];

    private static void boom(int x, int y, int s) {
        n2s[x][y] = -2;
        for (int i = 1; i <= s; i++) {
            if (x - i >= 0) {
                if (n2s[x - i][y] == -1) {
                    break;
                }
                if (n2s[x - i][y] == 0) {
                    n2s[x - i][y] = -2;
                }
            }
        }
        for (int i = 1; i <= s; i++) {
            if (y - i >= 0) {
                if (n2s[x][y - i] == -1) {
                    break;
                }
                if (n2s[x][y - i] == 0) {
                    n2s[x][y - i] = -2;
                }
            }
        }
        for (int i = 1; i <= s; i++) {
            if (x + i < 10) {
                if (n2s[x + i][y] == -1) {
                    break;
                }
                if (n2s[x + i][y] == 0) {
                    n2s[x + i][y] = -2;
                }
            }
        }
        for (int i = 1; i <= s; i++) {
            if (y + i < 10) {
                if (n2s[x][y + i] == -1) {
                    break;
                }
                if (n2s[x][y + i] == 0) {
                    n2s[x][y + i] = -2;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                n2s[i][j] = sc.nextInt();
            }
        }

        int count = sc.nextInt();
        int[][] characters = new int[count][2];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                characters[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (n2s[i][j] > 0) {
                    boom(i, j, n2s[i][j]);
                }
            }
        }

        for (int i = 0; i < count; i++) {
            if (n2s[characters[i][0] - 1][characters[i][1] - 1] >= 0) {
                n2s[characters[i][0] - 1][characters[i][1] - 1] = i + 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(n2s[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Character Information");

        for (int i = 0; i < count; i++) {
            if (n2s[characters[i][0] - 1][characters[i][1] - 1] >= 0) {
                System.out.println("player " + (i + 1) + " survive");
            } else {
                System.out.println("player " + (i + 1) + " dead");
            }
        }
    }
}