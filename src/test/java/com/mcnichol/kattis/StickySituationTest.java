package com.mcnichol.kattis;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static com.mcnichol.test.utils.TestUtil.convertToInputStream;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class StickySituationTest {

    @Test
    public void validateNonDegenerateTriangle() throws Exception {
        InputStream is = convertToInputStream("3\n1 1 1");
        OutputStream os = new ByteArrayOutputStream();
        StickySituation stickySituation = new StickySituation(is, os);

        stickySituation.main(new String[0]);

        assertThat(os.toString(), containsString("possible"));
    }

    @Test
    public void saysImpossibleOnDegenerateTrianble() throws Exception {
        InputStream is = convertToInputStream("5\n3 1 10 5 15");
        OutputStream os = new ByteArrayOutputStream();
        StickySituation stickySituation = new StickySituation(is, os);

        stickySituation.main(new String[0]);

        assertThat(os.toString(), containsString("impossible"));
    }
}