package codeup.UP1200.p1229;

import java.util.Scanner;

// 한글 출력 오류
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        double m = sc.nextDouble();
        double n;
        double bmi;

        if (k < 150) n = k - 100;
        else if (k >= 160) n = (k - 100) * 0.9;
        else n = (k - 150) / 2 + 50;
        bmi = (m - n) * 100 / n;

        if (bmi <= 10) System.out.print("정상");
        else if (bmi > 20) System.out.print("비만");
        else System.out.print("과체중");
    }
}