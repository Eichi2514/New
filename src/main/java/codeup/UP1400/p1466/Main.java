package codeup.UP1400.p1466;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = n * m;
                a = a - i;
                a = a - (n * j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}