package codeup.UP1700.p1705;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        String s = "";

        while (n > 0) {
            int m = n % 10;
            if (m == 3 || m == 6 || m == 9) {
                s += "K";
            }
            n /= 10;
        }

        if (s.length() > 0) System.out.println(s);
        else System.out.println(t);
    }
}