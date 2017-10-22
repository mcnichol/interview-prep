package com.mcnichol.kattis;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoriTest {
    @Test
    public void canConvertNamesToInitials() throws Exception {
        OutputStream output = new ByteArrayOutputStream();
        Autori autori = new Autori(convertToInputStream("Knuth-Morris-Pratt"), output);

        autori.main(new String[0]);

        assertThat(String.valueOf(output), containsString("KMP"));
    }

    @Test
    public void canConvertMultipleNames() throws Exception {
        OutputStream output = new ByteArrayOutputStream();
        Autori autori = new Autori(convertToInputStream("Mirko-Slavko"), output);

        autori.main(new String[0]);

        assertThat(String.valueOf(output), containsString("MS"));
    }

    private InputStream convertToInputStream(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }
}