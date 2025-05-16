package baekjoon.LV5.p7_2675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tmp = bf.readLine().split(" ");
            int x = Integer.parseInt(tmp[0]);
            for (int j = 0; j < tmp[1].length(); j++) {
                for (int k = 0; k < x; k++) {
                    bw.write(tmp[1].charAt(j));
                }
            }
            bw.newLine();
        }
        bw.flush();
    }
}