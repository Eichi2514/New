package codeup.UP1200.p1222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while (a < 90) {
            b++;
            a += 5;
        }
        if (b > c) System.out.println("win");
        else if (b < c) System.out.println("lose");
        else System.out.println("same");
    }
}