package baekjoon.LV8.p7_2869;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmps = bf.readLine().split(" ");
        double A = Double.parseDouble(tmps[0]);
        double B = Double.parseDouble(tmps[1]);
        double V = Double.parseDouble(tmps[2]);
        int count = (int) Math.ceil((V - B) / (A - B));

        bw.write(count + "");
        bw.flush();
    }
}