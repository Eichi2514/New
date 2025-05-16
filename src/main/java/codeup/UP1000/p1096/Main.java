package codeup.UP1000.p1096;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] go = new int[19][19];

        int n = sc.nextInt();
        for (int a = 0; a < n; a++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            go[x - 1][y - 1] = 1;
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(go[i][j] + " ");
            }
            System.out.println();
        }
    }
}