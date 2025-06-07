package codeup.UP1400.p1496;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n / 2; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print((a < b ? a : b) + " ");
        }
    }
}