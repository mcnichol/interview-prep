package com.mcnichol.kattis;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class StickySituationTest {
    @Test
    public void name() throws Exception {
        int[] a = new int[]{2, 3, 3, 1, 5, 2};

        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i]) - 1] < 0) {
                System.out.println(Math.abs(a[i]));
            }

            a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i])-1];
        }
    }

    @Test
    public void validateNonDegenerateTriangle() throws Exception {
        InputStream is = new ByteArrayInputStream((
                "3\n" +
                        "1 1 1"
        ).getBytes());
        OutputStream os = new ByteArrayOutputStream();
        StickySituation stickySituation = new StickySituation(is, os);

        stickySituation.main(new String[0]);

        assertThat(os.toString(), containsString("possible"));
    }

    @Test
    public void saysImpossibleOnDegenerateTrianble() throws Exception {
        InputStream is = new ByteArrayInputStream((
                "5\n" +
                        "3 1 10 5 15"
        ).getBytes());
        OutputStream os = new ByteArrayOutputStream();
        StickySituation stickySituation = new StickySituation(is, os);

        stickySituation.main(new String[0]);

        assertThat(os.toString(), containsString("impossible"));
    }
}