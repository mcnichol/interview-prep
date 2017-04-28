package com.mcnichol.topcoder;

public class EightRooksDriver {
    public static void main(String[] args) {
        EightRooks eightRooks = new EightRooks();

        String[] strings = new String[]{
                "R.......",
                ".R......",
                "..R.....",
                "...R....",
                "....R...",
                ".....R..",
                "......R.",
                ".......R",
        };

        System.out.println(eightRooks.isCorrect(strings));
    }
}
