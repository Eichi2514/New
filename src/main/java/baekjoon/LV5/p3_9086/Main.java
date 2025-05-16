package baekjoon.LV5.p3_9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String tmp = bf.readLine();
            bw.write(tmp.charAt(0) + "" + tmp.charAt(tmp.length() - 1));
            bw.newLine();
        }
        bw.flush();
    }
}