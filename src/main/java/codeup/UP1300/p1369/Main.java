package codeup.UP1300.p1369;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] temps = sc.nextLine().split(" ");
        int n = Integer.parseInt(temps[0]);
        int k = Integer.parseInt(temps[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else if (Math.floorMod(i + j + 1, k) == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}