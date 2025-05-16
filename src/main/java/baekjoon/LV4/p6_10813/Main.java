package baekjoon.LV4.p6_10813;

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
            bools[i] = i + 1;
        }
        for (int i = 0; i < max; i++) {
            tmp = bf.readLine().split(" ");
            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[1]);
            int t = bools[x - 1];
            bools[x - 1] = bools[y - 1];
            bools[y - 1] = t;
        }
        for (int i = 0; i < bools.length; i++) {
            bw.write(bools[i] + " ");
        }
        bw.flush();
    }
}