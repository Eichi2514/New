package codeup.UP1700.p1753;

import java.util.Scanner;

public class Main {

    public static void tmp(String s){
        for(int i = s.length() -1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            tmp(s);
            System.out.println();
        }
    }
}