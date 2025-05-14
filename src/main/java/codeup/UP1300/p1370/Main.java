package codeup.UP1300.p1370;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int r = sc.nextInt();

        int a = 0;
        boolean b = true;

        for (int i = 0; i < ((h * 2) - 1) * r; i++) {
            for (int j = 0; j <= a; j++) {
                if (j == a) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }

            if (b) {
                if (a < h - 1) a++;
                else {
                    b = false;
                    a--;
                    if (a < 0) a = 0;
                }
            } else {
                if (a == 0) b = true;
                a--;
                if (a < 0) a = 0;
            }
        }
    }
}