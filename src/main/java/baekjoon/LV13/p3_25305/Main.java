package baekjoon.LV13.p3_25305;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tmps = bf.readLine().split(" ");
        int N = Integer.parseInt(tmps[0]);
        int k = Integer.parseInt(tmps[1]);

        String[] tmps2 = bf.readLine().split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(tmps2[i]);
        }

        Arrays.sort(nums);

        bw.write(nums[nums.length - k] + "");

        bw.flush();
    }
}