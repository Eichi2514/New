package codeup.UP1000.p1087;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            i++;
            if (a <= sum) {
                System.out.println(sum);
                break;
            }
        }
    }
}