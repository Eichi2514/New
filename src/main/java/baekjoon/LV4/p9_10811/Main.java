package baekjoon.LV4.p9_10811;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            tmp = bf.readLine().split(" ");
            int[] nm = new int[2];
            nm[0] = Integer.parseInt(tmp[0]);
            nm[1] = Integer.parseInt(tmp[1]);
            int index = 0;
            int[] tmps = new int[nm[1] - nm[0] + 1];
            for (int j = nm[1] - 1; j >= nm[0] - 1; j--) {
                tmps[index] = numbers[j];
                index++;
            }
            index = 0;
            for (int j = nm[0] - 1; j <= nm[1] - 1; j++) {
                numbers[j] = tmps[index];
                index++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            bw.write(numbers[i] + " ");
        }
        bw.flush();
    }
}