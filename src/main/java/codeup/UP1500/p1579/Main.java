package codeup.UP1500.p1579;

import java.util.Scanner;

public class Main {
    private static int mymin(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mymin(a,b));
    }
}