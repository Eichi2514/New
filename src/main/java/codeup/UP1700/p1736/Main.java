package codeup.UP1700.p1736;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long second = sc.nextLong();
        int day = 0;
        int hour = 0;
        int minute = 0;


        while (second >= 60) {
            if (second >= 86400) {
                day++;
                second -= 86400;
            } else if (second >= 3600) {
                hour++;
                second -= 3600;
            } else {
                minute++;
                second -= 60;
            }
        }

        System.out.println(day + " " + hour + " " + minute + " " + second);
    }
}