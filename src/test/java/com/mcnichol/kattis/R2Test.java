package com.mcnichol.kattis;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static com.mcnichol.test.utils.TestUtil.convertToInputStream;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class R2Test {

    @Test
    public void canCalculateR2when_r1Equals11_sEquals15() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        InputStream testInput = convertToInputStream("11 15");
        new R2(testInput, out);

        R2.main(new String[0]);

        assertThat(out.toString(), containsString("19"));
    }

    @Test
    public void canCalculateR2when_r1Equals4_sEquals3() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        InputStream testInput = convertToInputStream("4 3");

        new R2(testInput, out);

        R2.main(new String[0]);

        assertThat(out.toString(), containsString("2"));
    }
}