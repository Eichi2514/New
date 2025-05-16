package codeup.UP1000.p1034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        int b = Integer.parseInt(data, 8);

        System.out.printf("%d", b);
    }
}