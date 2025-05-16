package codeup.UP1000.p1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a > b) System.out.println(1);
        else if (a <= b) System.out.println(0);
    }
}