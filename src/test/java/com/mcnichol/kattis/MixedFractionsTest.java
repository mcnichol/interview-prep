package com.mcnichol.kattis;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static com.mcnichol.test.utils.TestUtil.convertToInputStream;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class MixedFractionsTest {

    @Test
    public void convertsImproperFractionToMixedFraction() throws Exception {
        InputStream testInput = convertToInputStream("27 12\n2460000 98400\n3 4000\n0 0");
        ByteArrayOutputStream actualOutput = new ByteArrayOutputStream();

        MixedFractions mixedFractions = new MixedFractions(testInput, actualOutput);
        mixedFractions.main(new String[0]);

        assertThat(actualOutput.toString(), containsString("2 3 / 12\n"));
        assertThat(actualOutput.toString(), containsString("25 0 / 98400\n"));
        assertThat(actualOutput.toString(), containsString("0 3 / 4000\n"));
    }
}