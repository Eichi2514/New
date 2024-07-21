package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = 0;
        int time = (a * 60) + b;
        time -= 45;
        if (time < 0) time += (24*60);
        while (time >= 60) {
            h++;
            time -= 60;
        }
        System.out.println(h + " " + time);
    }
}