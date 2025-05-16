package baekjoon.LV4.p1_10807;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();
        String[] tokens = s.split(" ");
        String v = bf.readLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (tokens[i].equals(v)) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}