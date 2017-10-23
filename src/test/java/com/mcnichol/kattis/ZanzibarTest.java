package com.mcnichol.kattis;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ZanzibarTest {

    @Test
    public void name() throws Exception {
        InputStream testInput = new ByteArrayInputStream((
                "3\n" +
                        "1 100 0\n" +
                        "1 1 1 2 2 4 8 8 9 0\n" +
                        "1 28 72 0\n"
        ).getBytes());

        OutputStream acutalOutputStream = new ByteArrayOutputStream();

        Zanzibar zanzibar = new Zanzibar(testInput, acutalOutputStream);

        zanzibar.main(new String[0]);

        assertThat(acutalOutputStream.toString(), containsString("98"));
        assertThat(acutalOutputStream.toString(), containsString("0"));
        assertThat(acutalOutputStream.toString(), containsString("42"));
    }
}