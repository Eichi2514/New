package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        if (((y-m+d)%10) == 0) System.out.println("대박");
        else System.out.println("그럭저럭");
    }
}