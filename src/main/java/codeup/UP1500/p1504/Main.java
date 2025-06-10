package codeup.UP1500.p1504;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(((n * j) + (i + 1)) + " ");
                } else {
                    System.out.print(((n * (j + 1)) - i) + " ");
                }
            }
            System.out.println();
        }
    }
}