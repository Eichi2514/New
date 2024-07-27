package org.example;


import java.util.Arrays;
import java.util.List;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        String[] crat = {"c=", "c-","dz=","d-","lj","nj", "s=","z="};
        for (int i = 0; i < 8; i++) {
            if (tmp.contains(crat[i])) {
                tmp = tmp.replace(crat[i], "A");
            }
        }
        bw.write(tmp.length()+"");
        bw.flush();
    }
}