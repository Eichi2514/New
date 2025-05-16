package codeup.UP1000.p1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        String[] a = data.split("[.]");

        int d1 = Integer.parseInt(a[0]);
        int d2 = Integer.parseInt(a[1]);
        int d3 = Integer.parseInt(a[2]);
        System.out.printf("%02d-%02d-%04d", d3, d2, d1);
    }
}