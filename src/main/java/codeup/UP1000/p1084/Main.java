package codeup.UP1000.p1084;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;

        for (int i = 0; i < a; i++) {
            for (int q = 0; q < b; q++) {
                for (int w = 0; w < c; w++) {
                    System.out.println(i + " " + q + " " + w);
                    d++;
                }
            }
        }
        System.out.println(d);
    }
}