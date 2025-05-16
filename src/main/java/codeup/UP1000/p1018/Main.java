package codeup.UP1000.p1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String date[] = a.split("[:]");

        int c = Integer.parseInt(date[0]);
        int d = Integer.parseInt(date[1]);

        System.out.printf("%d:%d", c, d);
    }
}