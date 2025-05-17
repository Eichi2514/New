package baekjoon.LV13.p2_2587;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(bf.readLine());
            arr[i] = n;
            sum += n;
        }

        Arrays.sort(arr);

        bw.write((sum / 5) + "");
        bw.newLine();
        bw.write(arr[2] + "");

        bw.flush();
    }
}