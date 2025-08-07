package codeup.UP1900.p1990;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        if (sum % 3 == 0) System.out.println(1);
        else System.out.println(0);
    }
}