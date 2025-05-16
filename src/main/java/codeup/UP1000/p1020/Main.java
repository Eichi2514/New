package codeup.UP1000.p1020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String date[] = a.split("[-]");

        int b = Integer.parseInt(date[0]);
        int c = Integer.parseInt(date[1]);

        System.out.printf("%06d%07d", b, c);
    }
}