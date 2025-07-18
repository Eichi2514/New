package codeup.UP1700.p1716;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 305;

        c = c - (a / 2) - ((a - 1) * 30) - b;
        System.out.println(c);
    }
}