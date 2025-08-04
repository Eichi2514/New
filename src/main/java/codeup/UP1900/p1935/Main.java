package codeup.UP1900.p1935;

import java.util.Scanner;

public class Main {
    public static int f(int a, int b) {
        if (a == b) return a;
        if (a > b) return f(a / 2, b);
        else return f(a, b / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(f(a, b));
    }
}
