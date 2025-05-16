package baekjoon.LV5.p1_27866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        int n = Integer.parseInt(bf.readLine()) - 1;
        bw.write(tmp.charAt(n));
        bw.flush();
    }
}