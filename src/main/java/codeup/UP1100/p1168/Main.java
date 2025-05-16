package codeup.UP1100.p1168;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt() / 10000;
        int month = sc.nextInt();

        if (month > 2) System.out.println(2012 - (year + 1999));
        else System.out.println(2012 - (year + 1899));

        System.out.println();
    }
}