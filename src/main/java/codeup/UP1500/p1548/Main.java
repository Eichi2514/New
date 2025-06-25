package codeup.UP1500.p1548;

import java.util.Scanner;

public class Main {
    private static String grade(int k) {
        if (k >= 90) return "A";
        else if (k >= 80) return "B";
        else if (k >= 70) return "C";
        else if (k >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(grade(n));
    }
}