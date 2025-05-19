package codeup.UP1400.p1408;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] S = s.toCharArray();
        String S2 = "";
        String S3 = "";
        for (int i = 0; i < S.length; i++) {
            S2 += (char) (S[i] + 2);
            S3 += (char) ((S[i] * 7) % 80 + 48);
        }
        System.out.println(S2);
        System.out.println(S3);
    }
}