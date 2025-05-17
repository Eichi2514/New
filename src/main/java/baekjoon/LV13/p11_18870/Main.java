package baekjoon.LV13.p11_18870;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        int[] nums = new int[n];
        String[] strs = bf.readLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], index);
                index++;
            }
        }

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(strs[i]);
            bw.write(map.get(a) + " ");
        }

        bw.flush();
    }
}