package codeup.UP1100.p1170;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int C = sc.nextInt();
        String c;
        if (C < 10) c = "0" + C;
        else c = "" + C;
        System.out.println(a + b + c);
    }
}