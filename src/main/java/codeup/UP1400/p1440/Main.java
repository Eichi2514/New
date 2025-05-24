package codeup.UP1400.p1440;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];

        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (ns[i] < ns[j]) System.out.print("< ");
                    else if (ns[i] > ns[j]) System.out.print("> ");
                    else System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}