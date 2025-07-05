package codeup.UP1500.p1581;

import java.util.Scanner;

public class Main {
    static int a, b;

    private static void myswap() {
        int temp = a;
        a = Math.min(temp, b);
        b = Math.max(temp, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        myswap();
        System.out.printf("%d %d", a, b);
    }
}