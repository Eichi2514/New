package codeup.UP1900.p1902;

import java.util.Scanner;

public class Main {

    public static void f(int n) {
        if (n < 1) return;
        System.out.println(n);
        f(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }
}
