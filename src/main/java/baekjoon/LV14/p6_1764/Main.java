package baekjoon.LV14.p6_1764;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = bf.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(bf.readLine());
        }

        Set<String> result = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String str = bf.readLine();
            if (set1.contains(str)) {
                result.add(str);
            }
        }

        bw.write(result.size() + "\n");
        for (String str : result) {
            bw.write(str + "\n");
        }

        bw.flush();
    }
}
