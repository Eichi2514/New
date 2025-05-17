package baekjoon.LV10.p4_15894;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long tmp = Integer.parseInt(bf.readLine());
        bw.write((tmp * 4) + "");
        bw.flush();
    }
}