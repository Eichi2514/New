package codeup.UP1200.p1204;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tmp;
        if (n % 10 == 1 && 11 != n) tmp = n + "st";
        else if (n % 10 == 2 && 12 != n) tmp = n + "nd";
        else if (n % 10 == 3 && 13 != n) tmp = n + "rd";
        else tmp = n + "th";
        System.out.println(tmp);
    }
}