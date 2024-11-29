package project2.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class TextFileExam {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("menu.json");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String data;
        StringBuffer sb = new StringBuffer();
        while ((data = br.readLine()) != null) {
            sb.append(data);
            System.out.println(data);
        }
    }
}
