package SyncTastTwo;

//import java.sql.Timestamp;

import java.time.LocalTime;
//import java.util.Date;

public class Employee extends Thread {

    private String name;
    private boolean doWork = true;
    private static int workPeriod = 10000;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "I'm starting to work:" + LocalTime.now());
        while (doWork) {
            try {
                Thread.sleep(workPeriod);
                System.out.println(name + "I'm still working");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "I've finished today's work:" + LocalTime.now());

    }

    public void stopWork() {
        doWork = false;
        interrupt();
        workPeriod-=2000;
    }
}
//implements Runable
//}

//    private String name;
//    Date date = new Date();
//    long time = date.getTime();
//    Timestamp ts = new Timestamp(time);
//
//    public Employee(String name, Date date, long time, Timestamp ts) {
//        this.name = name;
//        this.date = date;
//        this.time = time;
//        this.ts = ts;
//    }
//
//    Employee(String name) {
//        System.out.println(name + " - " + "I came to work at" + ts);
//        this.name = name;
//        this.ts = new Timestamp(ts.getTime());
//    }
//
//
//    @Override
//    public void run() {
//
//        try {Thread.sleep(5000);
//            System.out.println("I'm still working.");
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//        try {
//            Thread.sleep(10000);
//            System.out.println("It's time to go home" + " " + name + " " + ts);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//
//
