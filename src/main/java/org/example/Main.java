package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = Integer.parseInt(a, 16);

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", b, i, b * i);
        }
    }
}