package codeup.UP1100.p1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n >= 50.0 && n <= 60.0) System.out.println("win");
        else System.out.println("lose");
    }
}