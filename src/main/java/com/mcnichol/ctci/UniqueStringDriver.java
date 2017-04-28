package com.mcnichol.ctci;

import java.util.Scanner;

public class UniqueStringDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        UniqueString us = new UniqueString();
        System.out.println(us.isCharactersUnique(input));
    }
}
