package codeup.UP1500.p1538;

import java.util.Scanner;

public class Main {

    private static void f(int n) {
        System.out.printf("%s\n", n % 2 == 0 ? "even" : "odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }
}
