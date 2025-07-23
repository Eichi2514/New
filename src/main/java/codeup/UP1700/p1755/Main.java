package codeup.UP1700.p1755;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split("\\.");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("dib", "Paint.Picture");
        map.put("doc", "Word.Document.8");
        map.put("docx", "Word.Document.12");
        map.put("htm", "htmfile");
        map.put("html", "htmlfile");
        map.put("hwp", "Hwp.Document.96");
        map.put("hwpx", "Hwp.Document.hwpx.96");
        map.put("hwt", "Hwp.Document.hwt.96");
        map.put("jpe", "jpegfile");
        map.put("jpeg", "jpegfile");
        map.put("jpg", "jpegfile");
        map.put("ppt", "PowerPoint.Show.8");
        map.put("pptx", "PowerPoint.Show.12");
        map.put("pptxml", "powerpointxmlfile");

        System.out.println(map.get(ss[1]));
    }
}