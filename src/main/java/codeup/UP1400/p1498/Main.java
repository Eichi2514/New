package codeup.UP1400.p1498;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = 1000;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            t = t > k ? k : t;

            if (i % m == m - 1 || i == n - 1) {
                System.out.print(t + " ");
                t = 1000;
            }
        }
    }
}