package codeup.UP1600.p1678;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nss = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nss[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        sum += nss[i+k][j+l];
                    }
                }
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);
    }
}