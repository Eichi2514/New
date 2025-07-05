package codeup.UP1600.p1610;

import java.util.Scanner;

public class Main {

    public static void mysubstr(String s, int start, int end) {
        String substring = s.substring(start, start + end);
        System.out.println(substring);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        mysubstr(s, start, end);
    }
}