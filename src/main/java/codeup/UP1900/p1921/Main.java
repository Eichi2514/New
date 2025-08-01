package codeup.UP1900.p1921;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        String result = Integer.toString(n, k).toUpperCase();
        System.out.println(result);
    }
}