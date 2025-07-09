package codeup.UP1600.p1660;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll(",", " ");
        System.out.println(s);
    }
}