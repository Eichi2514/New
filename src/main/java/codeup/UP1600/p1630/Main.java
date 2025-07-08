package codeup.UP1600.p1630;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i < n * 2; i++) {
            if (i % 2 != 0) {
                String s = sc.nextLine();
                System.out.println(s);
            } else {
                System.out.println("AMOLED");
            }
        }
    }
}