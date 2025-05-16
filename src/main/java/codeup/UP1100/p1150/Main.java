package codeup.UP1100.p1150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a < min) {
                min = a;
            }
        }
        System.out.println(min);
    }
}