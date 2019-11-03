package asdasd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Map {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("asdasdd", "asdqeqwe", "wqeqweqwe", "kkwejsdf", "asdtowjj", "wqkktg", "keqwrheh");

        HashMap<String, List<String>> dictionary = new HashMap<>();

        for (String word : strings) {
            String c = word.substring(0, 1);
            String key = "'" + c + "'";

            if (dictionary.containsKey(key)) {
                List<String> letterWord = dictionary.get(key);
                letterWord.add(word);

            } else {
                LinkedList<String> letterWords = new LinkedList<>();
                letterWords.add(word);
                dictionary.put(key, letterWords);
            }
        }
        dictionary.entrySet().forEach(System.out::println);


//        for (String string : strings) {
//            for (int i = 0; i < string.length(); i++) {
//                String c = string.substring(i, i+1);
//                String key = "'" + c + "'";
//
//                if (dictionary.containsKey(key)) {
//                    int count = dictionary.get(key);
//                    dictionary.put(key, count + 1);
//                } else {
//                    dictionary.put(key, 1);
//
//
//                }
//            }
//        }
//        dictionary.entrySet().forEach(System.out::println);
    }
}

