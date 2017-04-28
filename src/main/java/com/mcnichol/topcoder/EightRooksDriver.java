package com.mcnichol.topcoder;

public class EightRooksDriver {
    public static void main(String[] args) {
        EightRooks eightRooks = new EightRooks();

        String[][] correctStrings = new String[][]{{
                "R.......",
                ".R......",
                "..R.....",
                "...R....",
                "....R...",
                ".....R..",
                "......R.",
                ".......R",
        }, {
                "......R.",
                "....R...",
                "...R....",
                ".R......",
                "R.......",
                ".....R..",
                "..R.....",
                ".......R"
        }};

        String[][] incorrectStrings = new String[][]{{
                "........",
                "........",
                "........",
                "........",
                "........",
                "........",
                "........",
                "........"
        }, {
                "......R.",
                "....R...",
                "...R....",
                ".R......",
                "R.......",
                ".......R",
                "..R.....",
                ".......R"
        }, {
                "........",
                "....R...",
                "........",
                ".R......",
                "........",
                "........",
                "..R.....",
                "........"
        }};

        for (String[] correct : correctStrings) {
            System.out.println(eightRooks.isCorrect(correct));
        }

        for (String[] incorrect : incorrectStrings) {
            System.out.println(eightRooks.isCorrect(incorrect));
        }
    }
}
