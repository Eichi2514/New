package baekjoon.LV5.p11_11718;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp;
        while ((tmp = bf.readLine()) != null) {
            bw.write(tmp);
            bw.newLine();
        }
        bw.flush();
    }
}