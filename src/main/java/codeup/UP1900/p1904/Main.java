package codeup.UP1900.p1904;

import java.util.Scanner;

public class Main {

    public static void f(int start, int end) {
        if (start > end) return;
        if (start % 2 != 0) System.out.print(start + " ");
        f(start + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        f(start, end);
    }
}