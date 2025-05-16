package codeup.UP1100.p1165;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 90 - sc.nextInt();
        int b = sc.nextInt();
        while (a >= 1) {
            a -= 5;
            b++;
        }
        System.out.println(b);
    }
}