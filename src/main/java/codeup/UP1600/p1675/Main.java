package codeup.UP1600.p1675;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = "";

        for (char c : a.toCharArray()) {
            if (c == ' ') {
                b += ' ';
            } else {
                char d = (char) (c - 3);
                if (d < 'a') {
                    d = (char) (d + 26);
                }
                b += d;
            }
        }

        System.out.println(b);
    }
}
