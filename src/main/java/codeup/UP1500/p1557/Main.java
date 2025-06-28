package codeup.UP1500.p1557;

import java.util.Scanner;

public class Main {
    private static long f(int n) {
        long count = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("%d", f(n));
    }
}