package codeup.UP1500.p1537;

import java.util.Scanner;

public class Main {
    static int n;

    private static void f() {
        if (n == 1) System.out.println("hello");
        else System.out.println("world");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f();
    }
}
