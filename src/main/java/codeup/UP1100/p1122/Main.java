package codeup.UP1100.p1122;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        while (n >= 60) {
            n -= 60;
            m++;
        }
        System.out.print(m + " " + n);
    }
}