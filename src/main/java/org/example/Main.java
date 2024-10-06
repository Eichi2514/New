package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n%m == 0){
            System.out.print(m+"*"+n/m+"="+n);
        }else if (m%n == 0){
            System.out.print(n+"*"+m/n+"="+m);
        }else System.out.print("none");
    }
}