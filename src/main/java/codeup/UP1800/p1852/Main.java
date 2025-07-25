package codeup.UP1800.p1852;

import java.util.Scanner;

public class Main {
    public static void f(int k) {
        if (k == 0) return;
        f(k - 1);
        System.out.print(k + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }
}