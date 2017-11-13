package com.mcnichol.interviewing.katas;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static com.mcnichol.test.utils.TestUtil.convertToInputStream;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * Write a function to create a table from CSV data.
 * <p>
 * <strong>Method Signature:</strong>
 * <p>
 * {@code public Iterable<String> toTable(Iterable<String> CSV_lines)}
 * <p>
 * <strong>Requirements:</strong>
 * <ul>
 * <li>The input to the function is a list of strings</li>
 * <li>Each string is formatted as a CSV record</li>
 * <li>In the input a semicolon separates values within a line.</li>
 * <li>The first record is interpreted as a header line.</li>
 * <li>The output should be the data formatted as an “ASCII table”</li>
 * <li>A separator line should follow the header line.</li>
 * <li>The column width follows the longest value in a column (which includes the header).
 * </li>
 * </ul>
 * <p>
 * <i>
 * More complicated features of CSV (e.g. delimiters within a value
 * need not be implemented. The input always is correctly formatted;
 * no validation necessary.
 * </i>
 * <p>
 * <strong>Input:</strong>
 * <p>
 * Name;Street;City;Age<br>
 * Peter Pan;Am Hang 5;12345 Einsam;42<br>
 * Maria Schmitz;Kölner Straße 45;50123 Köln;43<br>
 * Paul Meier;Münchener Weg 1;87654 München;65<br>
 * <p>
 * <strong>Output:</strong>
 * <pre>
 * Name         |Street          |City         |Age|
 * -------------+----------------+-------------+---+
 * Peter Pan    |Am Hang 5       |12345 Einsam |42 |
 * Maria Schmitz|Kölner Straße 45|50123 Köln   |43 |
 * Paul Meier   |Münchener Weg 1 |87654 München|65 |
 * </pre>
 */
public class CSVTableTest {

    private CSVTable myCsvTable;

    @Before
    public void setUp() throws Exception {
        myCsvTable = new CSVTable();
    }

    @Test
    public void createsHeaderAndRow() throws Exception {
        List<String> listOfData = new ArrayList<String>() {{
            add("TEST;TEST");
            add("TEST;TEST");
        }};
        String stringifiedList = String.join("\n", listOfData);
        InputStream inputStream = convertToInputStream(stringifiedList);

        List<String> strings = myCsvTable.toTable(inputStream);

        assertThat(strings.size(), equalTo(2));
    }

    @Test
    public void whenHeaderIsWidest_rowsWillMatchWidth() throws Exception {
        List<String> listOfData = new ArrayList<String>() {{
            add("A Wide Column;Another Wide Column");
            add("TEST;TEST");
        }};

        String stringifiedList = String.join("\n", listOfData);
        InputStream inputStream = convertToInputStream(stringifiedList);

        List<String> strings = myCsvTable.toTable(inputStream);

        int lengthOfHeaderRow = strings.get(0).length();
        int lengthOfFirstRow = strings.get(1).length();
        assertTrue("Row Widths should be equal",lengthOfHeaderRow == lengthOfFirstRow);
    }
}
