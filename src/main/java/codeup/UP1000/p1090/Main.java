package codeup.UP1000.p1090;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long r = sc.nextInt();
        long n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            a *= r;
        }
        System.out.println(a);
    }
}