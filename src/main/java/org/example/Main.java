package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tmp;
        if (n <= 10) tmp = "정상";
        else if (n <= 20) tmp = "과체중";
        else tmp = "비만";
        System.out.println(tmp);
    }
}