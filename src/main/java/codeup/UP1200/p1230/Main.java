package codeup.UP1200.p1230;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String CRASH = "PASS";
        String PASS = "";
        if (a <= 170) {
            CRASH = "CRASH";
            PASS = a + "";
        } else if (b <= 170) {
            CRASH = "CRASH";
            PASS = b + "";
        } else if (c <= 170) {
            CRASH = "CRASH";
            PASS = c + "";
        }
        System.out.println(CRASH + " " + PASS);
    }
}