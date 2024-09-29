package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] tmp = bf.readLine().split(" ");
            if(tmp[0].equals("0")&&tmp[1].equals("0")) break;
            else if(Integer.parseInt(tmp[0])/Integer.parseInt(tmp[1])==0) {
                bw.write("factor");
                bw.newLine();
            }else if(Integer.parseInt(tmp[0])%Integer.parseInt(tmp[1])==0) {
                bw.write("multiple");
                bw.newLine();
            }else {
                bw.write("neither");
                bw.newLine();
            }
        }
        bw.flush();
    }
}