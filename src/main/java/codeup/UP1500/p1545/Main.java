package codeup.UP1500.p1545;

import java.util.Scanner;

public class Main {
    private static boolean f(int n) {
        return n == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (f(n)) {
            System.out.println("zero");
        } else {
            System.out.println("non zero");
        }
    }
}