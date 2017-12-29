package com.mcnichol.ctci.chapter01.solutions;

import com.mcnichol.ctci.chapter01.Q01IsUnique;

public class Q01OptimalSolution implements Q01IsUnique{


    @Override
    public boolean isUnique(String input) {
        if(input.length() > 128) return false;

        boolean[] charSet = new boolean[128];
        for(int i=0; i < input.length(); i++){
            int val = input.charAt(i);

            if(charSet[val]){
                return false;
            }
            charSet[val] = true;
        }

        return true;
    }
}

/*
    0
    2
    3
    4
    5
    7
    8
*/