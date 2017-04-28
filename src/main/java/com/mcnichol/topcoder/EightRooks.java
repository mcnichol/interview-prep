package com.mcnichol.topcoder;


/*
Problem Statement:
Cat Snuke is playing a puzzle called Eight Rooks Puzzle. In this puzzle, he must put exactly eight rooks onto
an 8x8 chessboard. No two rooks must be in the same row, and no two rooks must be in the same column.

You are given a String[] board. The j-th character of the i-th element of board is either 'R' or '.'. If this is 'R',
the cell in row i, column j contains a rook. Otherwise the cell doesn't contain a rook.

Determine whether Snuke solved the puzzle correctly. If he solved the puzzle correctly, return "Correct". Otherwise
return "Incorrect".

Definition:
    Class:	EightRooks
    Method:	isCorrect
    Parameters:	String[]
    Returns:	String
    Method signature:	String isCorrect(String[] board)
    (be sure your method is public)

Constraints:
-	board will contain exactly 8 elements.
-	Each element of board will contain exactly 8 characters.
-	Each character in board will be either 'R' or '.'.

Examples:
0)

{"R.......",
 ".R......",
 "..R.....",
 "...R....",
 "....R...",
 ".....R..",
 "......R.",
 ".......R"}
Returns: "Correct"
1)

{"........",
 "....R...",
 "........",
 ".R......",
 "........",
 "........",
 "..R.....",
 "........"}
Returns: "Incorrect"
The number of rooks is not eight.
2)

{"......R.",
 "....R...",
 "...R....",
 ".R......",
 "R.......",
 ".....R..",
 "..R.....",
 ".......R"}
Returns: "Correct"
3)

{"......R.",
 "....R...",
 "...R....",
 ".R......",
 "R.......",
 ".......R",
 "..R.....",
 ".......R"}
Returns: "Incorrect"
The rightmost column contains two rooks.
4)

{"........",
 "........",
 "........",
 "........",
 "........",
 "........",
 "........",
 "........"}
Returns: "Incorrect"

Disclaimer:
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or
reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited.
(c)2010, TopCoder, Inc. All rights reserved.
 */
public class EightRooks {

    private static final char ROOK = 'R';
    private String[] board;

    public String isCorrect(String[] board) {
        this.board = board;

        byte row = 0;
        byte col = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                if (getCurrentPosition(i, j) == ROOK) {

                    if (checkForUnflippedBit(row, i)) {
                        row = flipBitAt(row, i);
                    } else {
                        return "Incorrect";
                    }

                    if (checkForUnflippedBit(col, j)) {
                        col = flipBitAt(col, j);
                    } else {
                        return "Incorrect";
                    }
                }
            }
        }

        return (row & col) == -1 ? "Correct" : "Incorrect";
    }

    private char getCurrentPosition(int row, int col) {
        return board[row].charAt(col);
    }

    private byte flipBitAt(byte row, int i) {
        return (byte) (row ^ (1 << i));
    }

    private boolean checkForUnflippedBit(byte row, int i) {
        return (row & 1 << i) == 0;
    }
}
