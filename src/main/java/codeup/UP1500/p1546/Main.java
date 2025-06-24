package codeup.UP1500.p1546;

import java.util.Scanner;

public class Main {
    private static boolean zero(int n) {
        return n == 0;
    }

    private static boolean plus(int n) {
        return n > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (zero(n)) {
            System.out.println("zero");
        } else {
            System.out.println(plus(n) ? "plus" : "minus");
        }
    }
}