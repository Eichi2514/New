package codeup.UP1500.p1550;

import java.util.Scanner;

public class Main {
    private static long sqrt(long a) {
        for (long i = 1; i <= a; i++) {
            if (i * i == a) return i;
            else if (i * i > a) return i - 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(sqrt(n));
    }
}