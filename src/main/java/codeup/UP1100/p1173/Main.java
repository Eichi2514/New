package codeup.UP1100.p1173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (h == 0) h = 24;
        m = ((h * 60) + m) - 30;
        h = 0;
        while (m >= 60) {
            m -= 60;
            h++;
        }
        if (h == 24) h = 0;
        System.out.println(h + " " + m);
    }
}