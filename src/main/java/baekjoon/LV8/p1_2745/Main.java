package baekjoon.LV8.p1_2745;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        String a = tmp[0];
        int b = Integer.parseInt(tmp[1]);
        long n = Integer.parseInt(a, b);
        bw.write(n + "");
        bw.flush();
    }
}