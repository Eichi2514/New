package codeup.UP1200.p1260;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) c += i;
        }
        System.out.println(c);
    }
}