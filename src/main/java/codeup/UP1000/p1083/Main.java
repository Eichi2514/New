package codeup.UP1000.p1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 3 != 0) System.out.printf("%d ", i);
            else System.out.printf("X ");
        }
    }
}