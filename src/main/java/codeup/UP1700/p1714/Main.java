package codeup.UP1700.p1714;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String tmp = "";

        for (int i = s.length() - 1; i >= 0 ; i--) {
            tmp += s.charAt(i);
        }

        System.out.println(tmp);
    }
}