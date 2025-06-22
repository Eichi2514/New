package codeup.UP1500.p1539;

import java.util.Scanner;

public class Main {

    private static void f(int n) {
        System.out.printf("%b\n", n != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }
}
