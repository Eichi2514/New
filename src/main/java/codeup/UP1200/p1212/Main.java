package codeup.UP1200.p1212;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String tmp = "no";
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        if (numbers[2] < numbers[0] + numbers[1]) tmp = "yes";
        System.out.println(tmp);
    }
}