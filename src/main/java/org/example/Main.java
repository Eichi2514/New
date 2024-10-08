package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (double i = 0; i < a; i++) {
            System.out.print("*");
        }
    }
}