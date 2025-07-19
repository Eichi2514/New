package codeup.UP1700.p1722;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ns2 = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                ns2[i][j] = sc.nextInt();
            }
        }

        double answer = 0;

        for (int i = 0; i < n - 1; i++) {
            answer += Math.sqrt(Math.pow(ns2[i + 1][0] - ns2[i][0], 2) + Math.pow(ns2[i + 1][1] - ns2[i][1], 2));
        }

        System.out.printf("%.2f\n", answer);
    }
}