package codeup.UP1900.p1912;

import java.util.Scanner;

public class Main {

    public static void f(int start, int end, long product) {
        if (start > end) {
            System.out.println(product);
            return;
        }

        f(start + 1, end, product * start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int end = sc.nextInt();
        long product = 1;
        f(start, end, product);
    }
}