package codeup.UP1300.p1380;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == n) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}