package codeup.UP1400.p1405;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = 0; j < n; j++) {
                System.out.print(t[index] + " ");
                if (index < n - 1) {
                    index++;
                } else {
                    index = 0;
                }
            }
            System.out.println();
        }
    }
}