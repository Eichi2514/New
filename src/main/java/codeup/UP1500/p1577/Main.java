package codeup.UP1500.p1577;

import java.util.Scanner;

public class Main {
    private static int myabs(int a) {
        return a >= 0 ? a : -a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(myabs(a));
    }
}