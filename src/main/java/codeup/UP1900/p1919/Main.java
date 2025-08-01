package codeup.UP1900.p1919;

import java.util.Scanner;

public class Main {
    public static void f(int n) {
        int answer = n % 10;

        if (answer != 0 || b) {
            System.out.print(answer);
            b = true;
        }

        if (n / 10 != 0) {
            f(n / 10);
        }
    }

    static boolean b = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else {
            f(n);
        }
    }
}