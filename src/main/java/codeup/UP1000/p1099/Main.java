package codeup.UP1000.p1099;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[11][11];

        int last = 0;

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                a[x][y] = sc.nextInt();
            }
        }
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                if (a[x][y] == 0) {
                    a[x][y] = 9;
                } else if (a[x][y] == 1) {
                    y -= 2;
                    x++;
                } else if (a[x][y] == 2) {
                    last = a[x][y];
                    a[x][y] = 9;
                    break;
                }
            }
            if (last == 2) break;
        }
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(a[x][y] + " ");
            }
            System.out.println("");
        }
    }
}