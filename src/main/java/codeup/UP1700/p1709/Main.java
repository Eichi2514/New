package codeup.UP1700.p1709;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];


        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }

        Arrays.sort(ns);

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ns[i] + " ");
        }
    }
}