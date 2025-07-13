package codeup.UP1700.p1701;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ns = new int[3];

        for (int i = 0; i < ns.length; i++) {
            ns[i] = sc.nextInt();
        }

        for (int i = ns.length-1; i >= 0; i--) {
            System.out.print(ns[i] + " ");
        }
    }
}