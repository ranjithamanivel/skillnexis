package week3;

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");

                for (String word : words) {
                    if (map.containsKey(word))
                        map.put(word, map.get(word) + 1);
                    else
                        map.put(word, 1);
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            for (String word : map.keySet()) {
                bw.write(word + " = " + map.get(word));
                bw.newLine();
            }

            bw.close();

            System.out.println("Word count saved in output.txt");

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
