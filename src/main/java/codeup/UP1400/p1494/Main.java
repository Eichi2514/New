package codeup.UP1400.p1494;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] d = new int[n];

        for (int i = 0; i < k; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int u = sc.nextInt();

            if (s - 1 < n) {
                d[s - 1] = d[s - 1] + u;
            }
            if (e < n) {
                d[e] = d[e] - u;
            }
        }

        for (int i = 0; i < 2; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print(d[j] + " ");
                } else {
                    tmp += d[j];
                    System.out.print(tmp + " ");
                }
            }
            System.out.println();
        }
    }
}