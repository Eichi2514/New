package baekjoon.LV4.p3_10818;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] tmp = bf.readLine().split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tmp[i]);
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < n - 1; i++) {
            if (max <= numbers[i + 1]) {
                max = numbers[i + 1];
            }
            if (min >= numbers[i + 1]) {
                min = numbers[i + 1];
            }
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}