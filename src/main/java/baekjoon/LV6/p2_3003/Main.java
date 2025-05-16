package baekjoon.LV6.p2_3003;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int[] tmpN = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            tmpN[i] = Integer.parseInt(tmp[i]);
        }
        int[] cs = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < tmpN.length; i++) {
            tmpN[i] = cs[i] - tmpN[i];
        }
        for (int i = 0; i < tmpN.length; i++) {
            bw.write(tmpN[i] + " ");
        }
        bw.flush();
    }
}