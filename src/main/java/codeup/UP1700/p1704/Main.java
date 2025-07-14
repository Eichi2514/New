package codeup.UP1700.p1704;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt() / 10000;
        int l = sc.nextInt() / 1000000;
        String m;
        int yyyy;

        if (l == 1 || l == 3) {
            m = "M";
            if (l == 1) {
                yyyy = 1900 + f;
            } else {
                yyyy = 2000 + f;
            }
        } else {
            m = "F";
            if (l == 2) {
                yyyy = 1900 + f;
            } else {
                yyyy = 2000 + f;
            }
        }

        System.out.printf("%d %s", 2013 - yyyy, m);
    }
}