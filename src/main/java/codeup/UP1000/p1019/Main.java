package codeup.UP1000.p1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String date[] = a.split("[.]");

        int c = Integer.parseInt(date[0]);
        int d = Integer.parseInt(date[1]);
        int e = Integer.parseInt(date[2]);

        System.out.printf("%04d.%02d.%02d", c, d, e);
    }
}