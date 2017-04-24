package com.mcnichol.interviewing.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordCountTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordList = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        String file = "/Users/enduser/tmp/gutenberg-books/grimms-fairy-tales.book";
        String line = null;
        String book = null;

        try (BufferedReader input = new BufferedReader(new FileReader(file))) {
            while ((line = input.readLine()) != null) {
                sb.append(line.toLowerCase().replaceAll("[^A-Za-z]", " ")).append(" ");
            }

            book = sb.toString();
        } catch (IOException io) {
            System.out.println(io.toString());
        }

        String[] words = book.split(" ");
        java.util.Arrays.sort(words);

        int totals = 0;
        int count = 0;
        String thisWord = "";
        String nextWord = "";
        for (int i = 0; i < words.length - 1; i++) {
            thisWord = words[i];
            nextWord = words[i + 1];
            count++;
            totals++;

            if (!thisWord.equals(nextWord)) {
                if (thisWord.length() > 0) {
                    wordList.put(thisWord, count);
                }
                count = 0;
            }
        }

        nextWord = words[words.length - 1];
        if (thisWord.equals(nextWord)) {
            count++;
        } else {
            count = 1;
        }
        if (words.length % 2 != 0) {
            wordList.put(nextWord, count);
        }

        Set set = wordList.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();
        System.out.println("Total Words: " + totals);
    }
}