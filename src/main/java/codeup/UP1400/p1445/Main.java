package codeup.UP1400.p1445;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        n = sc.nextInt();
        m = sc.nextInt();

        int[] ns = new int[n + m];

        for (int i = 0; i < n + m; i++) {
            ns[i] = sc.nextInt();
        }

        Arrays.sort(ns);

        for (int N : ns) {
            System.out.print(N + " ");
        }
    }
}