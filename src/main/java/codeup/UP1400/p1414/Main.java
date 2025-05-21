package codeup.UP1400.p1414;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                count1++;
                if (i != s.length() - 1 && s.charAt(i + 1) == 'c') {
                    count2++;
                }
            }
        }

        System.out.println(count1);
        System.out.println(count2);
    }
}