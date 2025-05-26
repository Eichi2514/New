package codeup.UP1400.p1460;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n * n; i++) {
            System.out.print(i + " ");
            if (i % n == 0) {
                System.out.println();
            }
        }
    }
}