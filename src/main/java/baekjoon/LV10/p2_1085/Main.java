package baekjoon.LV10.p2_1085;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int x = Integer.parseInt(tmp[0]);
        int y = Integer.parseInt(tmp[1]);
        int w = Integer.parseInt(tmp[2]);
        int h = Integer.parseInt(tmp[3]);
        int min = x;
        if (y < min) min = y;
        if (w - x < min) min = w - x;
        if (h - y < min) min = h - y;
        bw.write(min + "");
        bw.flush();
    }
}