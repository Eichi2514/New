package codeup.UP1200.p1203;

import java.util.Scanner;

// 한글 출력 오류
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 10) {
            System.out.print("정상");
        } else if (num <= 20) {
            System.out.print("과체중");
        } else {
            System.out.print("비만");
        }
    }
}