package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) sum += i;
            else sum -= i;
        }
        System.out.println(sum);
    }
}