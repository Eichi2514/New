package codeup.UP1000.p1076;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);

        for (char i = 'a'; i <= a; i++) {
            System.out.printf("%s ", i);
        }

    }
}