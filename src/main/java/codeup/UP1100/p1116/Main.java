package codeup.UP1100.p1116;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
        System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
        System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
        System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
    }
}