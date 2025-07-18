package codeup.UP1700.p1718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().replace("C", "").split("H", 2);
        int a = !ss[0].isEmpty() ? Integer.parseInt(ss[0]) : 1;
        int b = !ss[1].isEmpty() ? Integer.parseInt(ss[1]) : 1;
        System.out.println((12 * a) + b);
    }
}