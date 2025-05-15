package programmers.LV0.p181949;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        String newTmp = "";
        for (int i = 0; i < tmp.length(); i++) {
            char tmpC = tmp.charAt(i);
            if (Character.isUpperCase(tmpC)) {
                newTmp += Character.toLowerCase(tmpC);
            } else {
                newTmp += Character.toUpperCase(tmpC);
            }
        }
        System.out.println(newTmp);
    }
}