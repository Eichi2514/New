package codeup.UP1300.p1361;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("**");
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
        }
    }
}