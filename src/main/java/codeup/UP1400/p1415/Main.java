package codeup.UP1400.p1415;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = -1;
        int a2 = -1;

        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            if (tmp % 2 != 0 && tmp > a1) {
                a1 = tmp;
            } else if (tmp % 2 == 0 && tmp > a2) {
                a2 = tmp;
            }
        }
        if (a1 > -1 && a2 > -1) System.out.println(a1 + " " + a2);
        else if (a1 > -1) System.out.println(a1);
        else System.out.println(a2);
    }
}