package codeup.UP1000.p1067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String A = a < 0 ? "minus" : "plus";
        System.out.println(A);
        String B = a % 2 == 0 ? "even" : "odd";
        System.out.println(B);
    }
}