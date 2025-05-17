package baekjoon.LV12.p5_1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(bf.readLine());
        int num = 665;
        int count2 = 0;
        while (count != count2) {
            num++;
            String tmp = Integer.toString(num);
            if (tmp.contains("666")) {
                count2++;
            }
        }
        bw.write(num + "");
        bw.flush();
    }
}