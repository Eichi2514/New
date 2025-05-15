package programmers.LV0.p181944;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m;
        if (n % 2 == 0) m = "even";
        else m = "odd";
        System.out.print(n + " is " + m);
    }
}