package codeup.UP1300.p1358;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 0, m = 1;

        for (int i = (n / 2) + 1; i <= n; i++) {
            for (int j = 1; j <= n / 2 - l; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= m; k++) {
                System.out.print("*");
            }
            l++;
            m += 2;
            System.out.println();
        }
    }
}