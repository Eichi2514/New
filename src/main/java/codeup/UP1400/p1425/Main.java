package codeup.UP1400.p1425;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] ns = new int[n1];

        for (int i = 0; i < n1; i++) {
            ns[i] = sc.nextInt();
        }

        Arrays.sort(ns);

        for (int i = 0; i < n1; i++) {
            System.out.print(ns[i] + " ");
            if ((i + 1) % n2 == 0) {
                System.out.println();
            }
        }
    }
}