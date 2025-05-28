package codeup.UP1400.p1465;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = m; j > 0; j--) {
                System.out.print(((i * m) - j + 1) + " ");
            }
            System.out.println();
        }
    }
}