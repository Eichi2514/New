package codeup.UP1500.p1502;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(((n * j) + i) + " ");
            }
            System.out.println();
        }
    }
}