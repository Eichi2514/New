package codeup.UP1200.p1202;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ranking = "";
        if (n >= 90) ranking = "A";
        else if (n >= 80) ranking = "B";
        else if (n >= 70) ranking = "C";
        else if (n >= 60) ranking = "D";
        else ranking = "F";
        System.out.println(ranking);
    }
}