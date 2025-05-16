package codeup.UP1000.p1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        System.out.println("[" + data.charAt(0) + "0000]");
        System.out.println("[" + data.charAt(1) + "000]");
        System.out.println("[" + data.charAt(2) + "00]");
        System.out.println("[" + data.charAt(3) + "0]");
        System.out.println("[" + data.charAt(4) + "]");
    }
}