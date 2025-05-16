package codeup.UP1000.p1079;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b[] = a.split(" ");

        for (int i = 0; i < a.length(); i++) {
            System.out.println(b[i]);
            if (b[i].equals("q")) break;
        }
    }
}