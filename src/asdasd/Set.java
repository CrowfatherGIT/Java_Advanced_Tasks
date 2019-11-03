package asdasd;

import java.util.*;

public class Set {


    public static void main(String[] args) {

        List<String> strings = Arrays.asList("aba", "bob", "zcc", "ddd", "oee");

        HashSet<String> hashSet = new HashSet<>(strings);
        TreeSet<String> treeSet = new TreeSet<>(strings);

        System.out.println("Hashset:");
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("TreeSet:");
        for (String a : treeSet) {
            System.out.println(a);


        }
    }
}

