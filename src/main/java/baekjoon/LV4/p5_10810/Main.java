package baekjoon.LV4.p5_10810;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int number = Integer.parseInt(tmp[0]);
        int max = Integer.parseInt(tmp[1]);
        int[] bools = new int[number];
        for (int i = 0; i < number; i++) {
            bools[i] = 0;
        }
        for (int i = 0; i < max; i++) {
            tmp = bf.readLine().split(" ");
            int start = Integer.parseInt(tmp[0]);
            int end = Integer.parseInt(tmp[1]);
            int bool = Integer.parseInt(tmp[2]);
            for (int j = start - 1; j < end; j++) {
                bools[j] = bool;
            }
        }
        for (int i = 0; i < number; i++) {
            bw.write(bools[i] + " ");
        }
        bw.flush();
    }
}