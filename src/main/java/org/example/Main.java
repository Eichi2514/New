package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 1;
        for (int i = 0; i < k; i++) {
            sum *= n;
        }
        System.out.println(sum);
    }
}