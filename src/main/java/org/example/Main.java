package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double max = n+m;
        if (n-m > max) max = n-m;
        if (m-n > max) max = m-n;
        if (n*m > max) max = n*m;
        if (n/m > max) max = n/m;
        if (m/n > max) max = m/n;
        if (Math.pow(n,m) > max) max = Math.pow(n,m);
        if (Math.pow(m,n) > max) max = Math.pow(m,n);
        System.out.printf("%6f",max);
    }
}