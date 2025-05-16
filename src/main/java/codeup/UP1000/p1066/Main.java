package codeup.UP1000.p1066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String A = a % 2 == 0 ? "even" : "odd";
        System.out.println(A);
        String B = b % 2 == 0 ? "even" : "odd";
        System.out.println(B);
        String C = c % 2 == 0 ? "even" : "odd";
        System.out.println(C);
    }
}