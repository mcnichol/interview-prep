package com.mcnichol.kattis;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import static com.mcnichol.test.utils.TestUtil.convertToInputStream;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoriTest {
    @Test
    public void canConvertNamesToInitials() throws Exception {
        OutputStream output = new ByteArrayOutputStream();
        new Autori(convertToInputStream("Knuth-Morris-Pratt"), output);

        Autori.main(new String[0]);

        assertThat(String.valueOf(output), containsString("KMP"));
    }

    @Test
    public void canConvertMultipleNames() throws Exception {
        OutputStream output = new ByteArrayOutputStream();
        new Autori(convertToInputStream("Mirko-Slavko"), output);

        Autori.main(new String[0]);

        assertThat(String.valueOf(output), containsString("MS"));
    }

}