package codeup.UP1800.p1856;

import java.util.Scanner;

public class Main {
    public static int f(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return f(n - 1) + f(n - 2) + f(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}