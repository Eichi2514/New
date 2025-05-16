package codeup.UP1200.p1207;

import java.util.Scanner;

// 한글 출력 오류
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int tmp;

        for (int i = 0; i < 4; i++) {
            tmp = sc.nextInt();
            if (tmp == 1) count++;
        }

        if (count == 1) System.out.print("도");
        else if (count == 2) System.out.print("개");
        else if (count == 3) System.out.print("걸");
        else if (count == 4) System.out.print("윷");
        else System.out.print("모");
    }
}