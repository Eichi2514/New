package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        int b  = Integer.parseInt(data, 16);

        System.out.printf("%o",b);
    }
}