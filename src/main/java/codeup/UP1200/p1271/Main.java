package codeup.UP1200.p1271;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (max < a) max = a;
        }
        System.out.println(max);
    }
}