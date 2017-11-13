package com.mcnichol.interviewing.katas;

import java.io.InputStream;
import java.util.*;

public class CSVTable {
    private Map<Integer, List<Integer>> byRowMetadata = new HashMap<>();
    private Integer tableRowIndex = 0;

    public List<String> toTable(InputStream inputStream) {
        List<String> returnedTable = new ArrayList<>();
        Scanner scanner = new Scanner(inputStream);

        while(scanner.hasNext()){
            String row = scanner.nextLine();
            String[] rowSplitOnColumns = row.split(";");

            for(int i = 0; i < rowSplitOnColumns.length; i++){
                
            }
        }

        return returnedTable;
    }
}
