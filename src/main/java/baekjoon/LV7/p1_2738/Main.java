package baekjoon.LV7.p1_2738;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int[] n = new int[]{Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1])};
        int[][] numbers = new int[n[0]][n[1]];
        for (int x = 0; x < 2; x++) {
            for (int i = 0; i < n[0]; i++) {
                tmp = bf.readLine().split(" ");
                for (int j = 0; j < n[1]; j++) {
                    numbers[i][j] += Integer.parseInt(tmp[j]);
                }
            }
        }
        for (int i = 0; i < n[0]; i++) {
            for (int j = 0; j < n[1]; j++) {
                bw.write(numbers[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}