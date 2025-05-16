package codeup.UP1200.p1231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        String[] tmps = null;
        if (tmp.contains("+")) tmps = tmp.split("\\+");
        else if (tmp.contains("-")) tmps = tmp.split("-");
        else if (tmp.contains("*")) tmps = tmp.split("\\*");
        else if (tmp.contains("/")) tmps = tmp.split("/");
        if (tmp.contains("+")) {
            int a = Integer.parseInt(tmps[0]);
            int b = Integer.parseInt(tmps[1]);
            System.out.println(a + b);
        } else if (tmp.contains("-")) {
            int a = Integer.parseInt(tmps[0]);
            int b = Integer.parseInt(tmps[1]);
            System.out.println(a - b);
        } else if (tmp.contains("*")) {
            int a = Integer.parseInt(tmps[0]);
            int b = Integer.parseInt(tmps[1]);
            System.out.println(a * b);
        } else if (tmp.contains("/")) {
            double a = Integer.parseInt(tmps[0]);
            double b = Integer.parseInt(tmps[1]);
            System.out.printf("%.2f", a / b);
        }
    }
}