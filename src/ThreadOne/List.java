//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class List {
//    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<String>();
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println(list);
//            String next = sc.nextLine();
//            if (next.isEmpty()) {
//                break;
//            }
//            if (!list.contains(next)) {
//                list.add(next);
//            }
//            System.out.println("Deleting element:");
//            while (true) {
//                String next = sc.next();
//                if (next.isEmpty()) {
//                    break;
//                }
//                list.remove(next);
//            }
//            private static void showMWords (List <String> list) {
//                for (String s : list) {
//                    if (s.startsWith("m") || s.startsWith("M")) {
//                        System.out.println(s);
//                    }
//                }
//            }
//            private static void nextMWords (List < String > list) {
//                System.out.println("NextMWords");
//                for (int i = 0; i < list.size() - 1; i++) {
//                    String s = list.get(i + 1);
//                    if (s.startsWith("m") || s.startsWith("M")) {
//                        System.out.println(s);
//                    }
//                }
//            }
//
//        }
//    }
//}