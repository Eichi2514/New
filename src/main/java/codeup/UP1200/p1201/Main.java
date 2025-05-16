package codeup.UP1200.p1201;

import java.util.Scanner;

// 한글 출력 오류
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.print("양수");
        } else if (num == 0) {
            System.out.print("0");
        } else {
            System.out.print("음수");
        }
    }
}