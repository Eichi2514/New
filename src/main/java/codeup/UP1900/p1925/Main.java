package codeup.UP1900.p1925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(f(n1, n2));
    }

    public static long f(int n1, int n2) {
        if (n2 == 0 || n1 == n2) return 1;
        return f(n1 - 1, n2 - 1) + f(n1 - 1, n2);
    }
}