//package JavaAdvancedFinal;
//
//import java.io.*;
//import java.util.*;
//public class fileInput {
//    public static void main(String[] args) {
//        File file = new File("/Users/fudo/Desktop/Enums.rtf");
//        try (BufferedReader fileRead = new BufferedReader(new FileReader(file))) {
//            String allFileText = "";
//            String fileLine;
//            while ((fileLine = fileRead.readLine()) != null) {
//                allFileText += fileLine;
//            }
//            // All file contents in allFileText
//            TreeMap<Character, Integer> charStats = charCount(allFileText);
//            TreeMap<Integer, Character> mapSort = mapSort(charStats);
//            File newFile = new File("/Users/fudo/IdeaProjects/Java Advanced/src/JavaAdvancedFinal/output.txt");
//            try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(newFile))) {
//                for (Map.Entry<Integer, Character> entry : mapSort.entrySet()) {
//                    writeFile.write(entry.getValue() + ":" + entry.getKey() / 1000 + "\n");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    private static TreeMap<Character, Integer> charCount(String fileLine) {
//        TreeMap<Character, Integer> charCountMap = new TreeMap<>();
//        for (char key : fileLine.toCharArray()) {
//            if (charCountMap.containsKey(key)) {
//                charCountMap.put(key, charCountMap.get(key) + 1);
//            } else {
//                charCountMap.put(key, 1);
//            }
//        }
//        return charCountMap;
//    }
//    private static TreeMap<Integer, Character> mapSort(TreeMap<Character, Integer> map) {
//        TreeMap<Integer, Character> sortedMap = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            // A code= 1 10 times
//            // B code=5 9 times
//            // C code.. 9 times
//            // 10 * 1000 + 1  = 10001
//            // 9 * 1000 + 5   =  9005
//            // 9 * 1000 + ... =  900.
//            // 9 * 1000 + 128 = 10028
//            // Character = [-127, 128]
//            int appearances = entry.getValue() * 1000;
//            int uniqueValue = entry.getKey();
//            // 1234 567
//            sortedMap.put(appearances + uniqueValue, entry.getKey());
//        }
//        // sortedMap Ordered by appearances
//        return sortedMap;
//    }
//}