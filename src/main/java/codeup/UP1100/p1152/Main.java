package codeup.UP1100.p1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) System.out.println("small");
        else System.out.println("big");
    }
}