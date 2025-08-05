package codeup.UP1900.p1954;

import java.util.Scanner;

public class Main {
    public static void f2(int count) {
        if (count == 0) return;
        f2(count - 1);
        System.out.print("*");
    }

    public static void f(int a) {
        if (a == 0) return;
        f2(a);
        System.out.println();
        f(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f(a);
    }
}