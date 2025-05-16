package codeup.UP1200.p1282;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i * i > num) {
                int k = num - ((i - 1) * (i - 1));
                int t = i - 1;
                System.out.print(k + " " + t);
                break;
            }
        }
    }
}