package codeup.UP1400.p1410;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split("");
        int n1 = 0;
        int n2 = 0;
        for (String str : ss) {
            if (str.equals("(")) {
                n1++;
            } else if (str.equals(")")) {
                n2++;
            }
        }
        System.out.println(n1 + " " + n2);
    }
}