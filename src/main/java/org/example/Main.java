package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tmp = Integer.parseInt(bf.readLine());
        long count = 0;
        int[] A = new int[500000];
        int i = 0;
        for (int j = 0; j < tmp; j++) {
            count++;
            i = tmp / 2;
        }
        bw.write(count * count + "\n");
        bw.write(A[i] + 2 + "");
        bw.flush();
    }
}
