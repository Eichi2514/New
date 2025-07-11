package codeup.UP1600.p1673;

import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int GCD(int a, int b, int c) {
        int tmp = gcd(a, b);
        return gcd(tmp, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = GCD(a, b, c);

        System.out.println(result);
    }
}