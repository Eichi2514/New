package codeup.UP1100.p1164;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (170 >= a || 170 >= b || 170 >= c) System.out.println("CRASH");
        else System.out.println("PASS");
    }
}