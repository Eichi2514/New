package codeup.UP1200.p1291;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        for (int i = l; i >= 1; i--) {
            if (n % i == 0 && m % i == 0 && l % i == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}