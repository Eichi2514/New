package codeup.UP1100.p1155;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 7 == 0) System.out.println("multiple");
        else System.out.println("not multiple");
    }
}