package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = bf.readLine();
        int N = Integer.parseInt(num);
        int M = 0;
        for (int i = Math.max(0, N - 9 * String.valueOf(N).length()); i < N; i++) {
            int sum = 0;
            int tmp = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (i + sum == N) {
                M = i;
                break;
            }
        }
        bw.write(M + "\n");
        bw.flush();
    }
}