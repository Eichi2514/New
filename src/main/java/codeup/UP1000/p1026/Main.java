package codeup.UP1000.p1026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        String[] a = data.split("[:]");

        int d = Integer.parseInt(a[1]);
        System.out.println(d);
    }
}