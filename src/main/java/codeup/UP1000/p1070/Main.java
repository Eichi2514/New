package codeup.UP1000.p1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 12 || a < 3) System.out.println("winter");
        else if (a < 6) System.out.println("spring");
        else if (a < 9) System.out.println("summer");
        else if (a < 12) System.out.println("fall");
        else System.out.println("what?");
    }
}