package Algorithms;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

public class TreeNode {
    private String path;        //1010
    private String letter;      //a
    private int frequency;       //how much letters /or letter appears
    private TreeNode left;
    private TreeNode right;

    @Override
    public String toString() {
        return "TreeNode{" +
                "path='" + path + '\'' +
                ", letter='" + letter + '\'' +
                ", frequency=" + frequency +
                ", \n\tleft=" + left +
                ", \n\tright=" + right +
                '}';
    }

    public TreeNode(String path, String letter, int frequency, TreeNode left, TreeNode right) {
        this.path = path;
        this.letter = letter;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    public static TreeNode treeBuilder(Map<String, Integer> letterFrequencies) {
        TreeSet<TreeNode> allNodes = new TreeSet<>(new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return o1.frequency - o2.frequency;
            }
        });

        for (Map.Entry<String, Integer> entry : letterFrequencies.entrySet()) {
            allNodes.add(new TreeNode("", entry.getKey(), entry.getValue(), null, null));
        }

  //      allNodes.forEach(System.out::println);

        TreeNode first = allNodes.first();
        allNodes.remove(first);
        TreeNode second = allNodes.first();
        allNodes.remove(second);
        TreeNode newNode = new TreeNode("", first.letter+second.letter,first.frequency+second.frequency,first,second);
        allNodes.add(newNode);

        allNodes.forEach(System.out::println);

        TreeNode root = null;
        return root = null;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequncy) {
        this.frequency = frequncy;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
