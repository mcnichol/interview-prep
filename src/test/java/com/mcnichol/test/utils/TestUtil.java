package com.mcnichol.test.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestUtil {
    public static InputStream convertToInputStream(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }

}
