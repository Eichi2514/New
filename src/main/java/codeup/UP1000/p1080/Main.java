package codeup.UP1000.p1080;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b = 1;
        while (true) {
            sum += b;
            if (sum >= a) break;
            b++;
        }
        System.out.println(b);
    }
}