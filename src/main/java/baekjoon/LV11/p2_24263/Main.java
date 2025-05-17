package baekjoon.LV11.p2_24263;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tmp = Integer.parseInt(bf.readLine());
        int count = 0;
        int[] A = new int[500000];
        int i = 0;
        for (int j = 0; j < tmp; j++) {
            count++;
            i = tmp / 2;
        }
        bw.write(count + "\n");
        bw.write(A[i] + 1 + "");
        bw.flush();
    }
}