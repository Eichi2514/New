package codeup.UP1200.p1254;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        for (char c = a; c <= b; c++) {
            System.out.print(c + " ");
        }
    }
}