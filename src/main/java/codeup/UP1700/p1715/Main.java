package codeup.UP1700.p1715;

import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a, b);

        a = a / gcd;
        b = b / gcd;

        System.out.println(a + " " + b);
    }
}