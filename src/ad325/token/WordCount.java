package ad325.token;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void tokenCount(String filename) {

        java.util.Scanner scan;

        HashMap<String, Integer> tokenMap = new HashMap<>();

        // open the file for reading using Scanner
        try {
            scan = new java.util.Scanner(new java.io.File(filename));
        } catch (java.io.FileNotFoundException e) {
            scan = null;
        }

        // process the file, token by token, store the values and occurrences
        // in the map
        while (scan.hasNext()) {
            String temp = scan.next().toLowerCase();
            tokenMap.putIfAbsent(temp, 0);
            tokenMap.replace(temp, tokenMap.get(temp) + 1);
        }

        // close the file
        scan.close();

        // output statistics
        for (Map.Entry<String, Integer> item : tokenMap.entrySet()) {
            System.out.println("The word " + item.getKey() + " appears: " + item.getValue() + " times.");
        }
        //System.out.println("Token count: " + i);
        System.out.println();

    }

}
