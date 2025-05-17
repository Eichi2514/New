package baekjoon.LV11.p7_24313;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int a1 = Integer.parseInt(tmp[0]);
        int a0 = Integer.parseInt(tmp[1]);
        int c = Integer.parseInt(bf.readLine());
        int n0 = Integer.parseInt(bf.readLine());
        if (a1 * a0 <= c * n0) bw.write("1");
        else bw.write("0");
        bw.flush();
    }
}