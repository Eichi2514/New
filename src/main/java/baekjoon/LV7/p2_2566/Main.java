package baekjoon.LV7.p2_2566;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] numbers = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] tmp = bf.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                numbers[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        int max = numbers[0][0];
        int x = 1;
        int y = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        bw.write(max + "");
        bw.newLine();
        bw.write(x + " " + y);
        bw.flush();
    }
}