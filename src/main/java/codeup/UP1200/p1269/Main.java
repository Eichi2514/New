package codeup.UP1200.p1269;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if (n == 1) System.out.println(a);
        else {
            for (int i = 2; i <= n; i++) {
                a = a * b + c;
            }
            System.out.println(a);
        }
    }
}