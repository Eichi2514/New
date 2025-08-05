package codeup.UP1900.p1953;

import java.util.Scanner;

public class Main {
    public static void f2(int count) {
        if (count == 0) return;
        f2(count - 1);
        System.out.print("*");
    }

    public static void f(int a, int count) {
        if (count > a) return;
        f2(count);
        System.out.println();
        f(a, count + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f(a, 1);
    }
}