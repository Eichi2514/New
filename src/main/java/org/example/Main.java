package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmpN = sc.nextInt();
        String tmp = Integer.toString(tmpN);
        String[] tmps = tmp.split("");
        tmp = tmps[1]+tmps[0];
        tmpN = (Integer.parseInt(tmp)*2)%100;
        System.out.println(tmpN);
        if (tmpN <= 50) System.out.println("GOOD");
        else System.out.println("OH MY GOD");
    }
}