package codeup.UP1800.p1810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a.substring(b - 1, c));
    }
}