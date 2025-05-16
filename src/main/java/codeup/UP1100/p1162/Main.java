package codeup.UP1100.p1162;

import java.util.Scanner;

// 한글 출력 오류
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        if ((year - month + day) % 10 == 0) {
            System.out.println("대박");
        } else {
            System.out.println("그럭저럭");
        }
    }
}