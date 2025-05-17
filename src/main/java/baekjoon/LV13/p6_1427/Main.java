package baekjoon.LV13.p6_1427;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tmps = bf.readLine().split("");

        int[] nums = new int[tmps.length];

        for (int i = 0; i < tmps.length; i++) {
            nums[i] = Integer.parseInt(tmps[i]);
        }

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            bw.write(nums[i] + "");
        }

        bw.flush();
    }
}