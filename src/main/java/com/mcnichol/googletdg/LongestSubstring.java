package com.mcnichol.googletdg;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    private String targetString;
    private List<String> wordList;


    public String getTargetString() {
        return targetString;
    }

    public void setTargetString(String targetString) {
        this.targetString = targetString;
    }

    public void setWordTestList(List<String> wordList) {
        this.wordList = wordList;
    }

    public List<String> getWordTestList() {
        return new ArrayList<>(wordList);
    }


    public String testLongestSubsequence() {
        String longestSubSequence = null;

        //iterate through list of words
        for (int i = 0; i < wordList.size(); i++) {
            String s = wordList.get(i);

            //test word against target for match

        }

        //return longestSubSequence else null


        return longestSubSequence;
    }
}
