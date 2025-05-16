package baekjoon.LV4.p2_10871;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int[] nx = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            nx[i] = Integer.parseInt(tmp[i]);
        }
        tmp = bf.readLine().split(" ");
        int[] numbers = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            numbers[i] = Integer.parseInt(tmp[i]);
            if (numbers[i] < nx[1]) {
                bw.write((numbers[i]) + " ");
            }
        }
        bw.flush();
    }
}