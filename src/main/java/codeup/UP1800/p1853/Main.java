package codeup.UP1800.p1853;

import java.util.Scanner;

public class Main {
    public static void f(int sum, int k) {
        if (k == 0) {
            System.out.print(sum + " ");
            return;
        }
        f(sum + k, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        f(sum, n);
    }
}