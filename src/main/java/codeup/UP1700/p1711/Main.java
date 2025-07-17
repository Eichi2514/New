package codeup.UP1700.p1711;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int xa = sc.nextInt();
        int ya = sc.nextInt();

        if (x1 <= xa && xa <= x2 && y1 <= ya && ya <= y2) System.out.println("충돌");
        else System.out.println("비충돌");
    }
}