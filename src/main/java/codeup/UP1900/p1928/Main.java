package codeup.UP1900.p1928;

import java.util.Scanner;

public class Main {
    public static void f(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }

        if (n % 2 == 0) f(n / 2);
        else f(n * 3 + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        f(n);
    }
}