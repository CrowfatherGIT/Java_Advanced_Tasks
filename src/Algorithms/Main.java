package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> frequencies = new HashMap<>();

        frequencies.put("a", 10);
        frequencies.put("b", 12);
        frequencies.put("c", 8);
        frequencies.put("d", 4);
        frequencies.put("e", 2);

        TreeNode.treeBuilder(frequencies);

    }
}
