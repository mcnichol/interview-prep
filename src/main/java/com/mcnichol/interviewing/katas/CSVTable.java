package com.mcnichol.interviewing.katas;

import java.io.InputStream;
import java.util.*;

public class CSVTable {
    private Map<Integer, Integer> columnSize = new HashMap<>();
    private int rows;

    public List<String> toTable(InputStream inputStream) {
        List<String> returnedTable = new ArrayList<>();
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            rows++;
            String row = scanner.nextLine();
            String[] rowSplitOnColumns = row.split(";");

            for (int i = 0; i < rowSplitOnColumns.length; i++) {
                Integer thisColumnSize = columnSize.get(i);
                if (thisColumnSize != null) {
                    columnSize.put(i, rowSplitOnColumns[i].length() > thisColumnSize ? rowSplitOnColumns[i].length() : thisColumnSize);
                } else {
                    columnSize.put(i, rowSplitOnColumns[i].length());
                }
            }
        }

        int size = columnSize.size();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            int colWidth = columnSize.get(i);
            for (int j = 0; j < colWidth; j++) {
                sb.append(" ");
            }
            sb.append("|");
        }

        for (int i = 0; i < rows; i++) {
            returnedTable.add(sb.toString());
        }

        return returnedTable;
    }
}
