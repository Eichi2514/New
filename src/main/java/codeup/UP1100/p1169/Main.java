package codeup.UP1100.p1169;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int year = (2013 - age) % 100;
        int month = 1;
        if (age <= 13) month = 3;
        System.out.println(year + " " + month);
    }
}