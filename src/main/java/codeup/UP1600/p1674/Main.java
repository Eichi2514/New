package codeup.UP1600.p1674;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        int sum = 0;

        while (a > 0) {
            sum += (int) (a % 10);
            a /= 10;
        }

        if (sum % 7 == 4) {
            System.out.println("Bad");
        } else System.out.println("Good");
    }
}