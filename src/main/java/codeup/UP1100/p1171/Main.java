package codeup.UP1100.p1171;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String a = Integer.toString(A);
        String b = Integer.toString(B);
        if (B < 10) b = "0" + B;
        String c = Integer.toString(C);
        if (C < 10) c = "00" + C;
        else if (C < 100) c = "0" + C;

        System.out.println("" + a + b + c);
    }
}