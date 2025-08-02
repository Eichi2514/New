package codeup.UP1900.p1922;

import java.util.Scanner;

public class Main {
    static int count = 1;

    public static void f(int n) {
        if (n == 1) {
            System.out.println(count);
            return;
        }
        count++;

        if (n % 2 == 0) f(n / 2);
        else f(n * 3 + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        f(n);
    }
}