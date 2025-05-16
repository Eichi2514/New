package baekjoon.LV1.p11_11382;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        long sum = Arrays.stream(inputs)
                .mapToLong(e -> Long.parseLong(e))
                .sum();

        System.out.println(sum);
    }
}
