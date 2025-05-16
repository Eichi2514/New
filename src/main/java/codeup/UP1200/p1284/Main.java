package codeup.UP1200.p1284;

import java.util.*;

public class Main {

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int a = i;
                int b = n / i;
                if (isPrime(a) && isPrime(b)) {
                    System.out.print(a + " " + b);
                    return;
                }
            }
        }

        System.out.print("wrong number");
    }
}