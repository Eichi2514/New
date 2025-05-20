package codeup.UP1400.p1411;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            ns[i] = sc.nextInt();
        }

        Arrays.sort(ns);

        for (int i = 1; i <= n; i++) {
            if (i == n || i != ns[i - 1]) {
                System.out.println(i);
                break;
            }
        }
    }
}