package codeup.UP1700.p1712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k = sc.nextInt();
        int tmp = n2 - n1;

        while (n1 <= k) {
            System.out.print(n1 + " ");
            n1 += tmp;
        }
    }
}