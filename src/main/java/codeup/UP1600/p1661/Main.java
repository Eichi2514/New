package codeup.UP1600.p1661;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll(" ", "");
        s = s.replaceAll(",", " ");
        s = s.replaceAll(";", "\n");
        System.out.printf(s);
    }
}