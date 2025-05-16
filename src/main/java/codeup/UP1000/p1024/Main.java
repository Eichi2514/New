package codeup.UP1000.p1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        for (int a = 0; a < data.length(); a++) {
            System.out.println("\'" + data.charAt(a) + "\'");
        }
    }
}