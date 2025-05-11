package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sn = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                Sn += j;
            }
        }

        System.out.println(Sn);
    }
}