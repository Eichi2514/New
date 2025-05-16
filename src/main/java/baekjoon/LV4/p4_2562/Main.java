package baekjoon.LV4.p4_2562;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.parseInt(bf.readLine());
        int i = 1;
        int count = i;
        String s;
        while ((s = bf.readLine()) != null) {
            i++;
            if (max <= Integer.parseInt(s)) {
                max = Integer.parseInt(s);
                count = i;
            }
        }
        bw.write(max + " " + count);
        bw.newLine();
        bw.flush();
    }
}