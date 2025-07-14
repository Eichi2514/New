package codeup.UP1700.p1703;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long h = 0, m = 0;

        while (s >= 60) {
            if (s >= 3600) {
                h++;
                s -= 3600;
            } else {
                m++;
                s -= 60;
            }
        }
        System.out.printf("%d %d %d", h, m, s);
    }
}