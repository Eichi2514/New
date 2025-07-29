package codeup.UP1900.p1901;

import java.util.Scanner;

public class Main {

    public static void f(int start, int end) {
        if (start > end) return;
        System.out.println(start);
        f(start + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int end = sc.nextInt();
        f(start, end);
    }
}
