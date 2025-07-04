package codeup.UP1500.p1578;

import java.util.Scanner;

public class Main {
    private static int mymax(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mymax(a,b));
    }
}