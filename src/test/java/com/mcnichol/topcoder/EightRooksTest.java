package com.mcnichol.topcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightRooksTest {

    private EightRooks eightRooks;

    @Before
    public void setUp() throws Exception {
        eightRooks = new EightRooks();
    }

    @Test
    public void correctTest1() throws Exception {

        String[] correct = new String[]{
                "R.......",
                ".R......",
                "..R.....",
                "...R....",
                "....R...",
                ".....R..",
                "......R.",
                ".......R",
        };

        assertEquals(eightRooks.isCorrect(correct), "Correct");
    }

    @Test
    public void correctTest2() throws Exception {
        String[] correct = new String[]{
                "......R.",
                "....R...",
                "...R....",
                ".R......",
                "R.......",
                ".....R..",
                "..R.....",
                ".......R"
        };
        assertEquals(eightRooks.isCorrect(correct), "Correct");
    }

    @Test
    public void incorrectTest1() throws Exception {
        String[] incorrect = new String[]{
                "........",
                "........",
                "........",
                "........",
                "........",
                "........",
                "........",
                "........"
        };

        assertEquals(eightRooks.isCorrect(incorrect), "Incorrect");
    }

    @Test
    public void incorrectTest2() throws Exception {
        String[] incorrect = new String[]{
                "......R.",
                "....R...",
                "...R....",
                ".R......",
                "R.......",
                ".......R",
                "..R.....",
                ".......R"
        };

        assertEquals(eightRooks.isCorrect(incorrect), "Incorrect");
    }

    @Test
    public void incorrectTest3() throws Exception {
        String[] incorrect = new String[]{
                "........",
                "....R...",
                "........",
                ".R......",
                "........",
                "........",
                "..R.....",
                "........"
        };

        assertEquals(eightRooks.isCorrect(incorrect), "Incorrect");
    }
}