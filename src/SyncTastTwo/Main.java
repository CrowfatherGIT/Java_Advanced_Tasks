package SyncTastTwo;

import java.util.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<String> names = Arrays.asList("A", "B", "C", "D", "E");
        List<String> freeingSeq = Arrays.asList("A", "B", "C", "D", "E");
        Collections.shuffle(freeingSeq);
        Map<String, Employee> employees = new HashMap<>();

        for (String name : names) {
            employees.put(name, new Employee(name));
        }
        employees.values().forEach((Thread::start));

        System.out.println("We will let go home ..." + freeingSeq);


        for (String s : freeingSeq) {
            Thread.sleep(30000);

            employees.get(s).stopWork();
        }
        Thread.sleep(10000);
    }
}


//        List<Thread> persons = new LinkedList<>();
//
//        for (int i = 0; i < 5; ++i) {
//            Thread employee = new Thread(new Employee("Average Joe"));
//            persons.add(employee);
//            new Thread(employee).start();
//        }
//


