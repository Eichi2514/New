package codeup.UP1600.p1617;

import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reversed = Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString());
        int sum = n + reversed;

        if (isPalindrome(sum)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}