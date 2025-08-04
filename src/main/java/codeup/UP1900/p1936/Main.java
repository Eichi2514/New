package codeup.UP1900.p1936;

import java.util.Scanner;

public class Main {
    public static int f(int a, int b, int count) {
        if (a == b) return count;
        if (a > b) return f(a / 2, b, count + 1);
        else return f(a, b / 2, count + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(f(a, b, 0));
    }
}