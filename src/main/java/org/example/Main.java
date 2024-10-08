package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] % 5 == 0 && flag) {
                System.out.println(nums[i]);
                flag = false;
            }
        }
        if (flag) System.out.println(0);
    }
}