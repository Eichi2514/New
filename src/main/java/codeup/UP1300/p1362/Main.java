package codeup.UP1300.p1362;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                count++;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
    }
}