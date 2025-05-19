package codeup.UP1400.p1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ns = new int[10];
        for (int i = 0; i < 10; i++) {
            ns[i] = sc.nextInt();
        }
        int n = sc.nextInt()-1;
        System.out.println(ns[n]);
    }
}