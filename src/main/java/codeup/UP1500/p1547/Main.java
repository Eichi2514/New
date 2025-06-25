package codeup.UP1500.p1547;

import java.util.Scanner;

public class Main {
    private static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int sqrt = (int)Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
    }
}