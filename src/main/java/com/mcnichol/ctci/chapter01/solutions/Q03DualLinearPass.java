package com.mcnichol.ctci.chapter01.solutions;

import com.mcnichol.ctci.chapter01.Q03URLify;

public class Q03DualLinearPass implements Q03URLify {

    @Override
    public String urlify(char[] aString, int trueLength) {
        if (guardAgainstNullStrings(aString)) return "";

        int whiteSpaceCount = countWhiteSpaces(aString, trueLength);

        char[] chars = new char[trueLength + whiteSpaceCount * 2];

        int charsIndex = 0;
        for (int i = 0; i < trueLength; i++) {
            if (aString[i] == ' ') {
                charsIndex = insertEscapedWhiteSpace(chars, charsIndex);
            } else {
                chars[charsIndex++] = aString[i];
            }
        }

        return String.valueOf(chars);
    }

    private int insertEscapedWhiteSpace(char[] chars, int charsIndex) {
        chars[charsIndex++] = '%';
        chars[charsIndex++] = '2';
        chars[charsIndex++] = '0';
        return charsIndex;
    }

    private int countWhiteSpaces(char[] aString, int trimmedStringEndIdx) {
        int count = 0;

        for (int i = 0; i < trimmedStringEndIdx; i++) {
            if (aString[i] == ' ') {
                count++;
            }
        }

        return count;
    }

    private boolean guardAgainstNullStrings(char[] aString) {
        return aString == null;
    }
}
