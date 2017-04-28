package com.mcnichol.ctci;

import java.util.ArrayList;

public class UniqueString {

    public boolean isCharactersUnique(String input) {
        ArrayList<Character> characterList = new ArrayList<>();
        char[] c = input.toCharArray();

        for (char aC : c) {
            if (characterList.contains(aC)) {
                return false;
            }
            characterList.add(aC);
        }
        return true;
    }
}
