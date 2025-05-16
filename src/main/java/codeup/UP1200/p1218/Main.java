package codeup.UP1200.p1218;

import java.util.Arrays;
import java.util.Scanner;

// 한글 출력 오류
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        if (numbers[2] >= numbers[0] + numbers[1]) System.out.println("삼각형아님");
        else if (a == b && b == c) System.out.println("정삼각형");
        else if (a == b || b == c || a == c) System.out.println("이등변삼각형");
        else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) System.out.println("직각삼각형");
        else System.out.println("삼각형");
    }
}