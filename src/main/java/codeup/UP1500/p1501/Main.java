package codeup.UP1500.p1501;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(((n * i) + j) + " ");
            }
            System.out.println();
        }
    }
}