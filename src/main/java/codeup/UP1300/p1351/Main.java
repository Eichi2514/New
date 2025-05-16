package codeup.UP1300.p1351;

import java.util.*;

public class Main {

    public static int solution(int num) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            solution(i);
        }
    }
}