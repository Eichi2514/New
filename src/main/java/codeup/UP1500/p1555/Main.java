package codeup.UP1500.p1555;

import java.util.Scanner;

public class Main {
    private static long f(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("%d", f(n));
    }
}