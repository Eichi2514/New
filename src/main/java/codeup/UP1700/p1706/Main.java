package codeup.UP1700.p1706;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ns = new int[5];

        for (int i = 0; i < 5; i++) {
            ns[i] = sc.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(ns[i] + " ");
        }
    }
}