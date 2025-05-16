package codeup.UP1100.p1174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        m = ((h * 60) + m) - 30;
        m += 1440;
        while (m >= 1440) {
            m -= 1440;
        }
        h = 0;
        while (m >= 60) {
            m -= 60;
            h++;
        }
        System.out.println(h + " " + m);
    }
}