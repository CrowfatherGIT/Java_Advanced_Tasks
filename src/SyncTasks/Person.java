package SyncTasks;

    public class Person implements Runnable {
        private int     age;
        private boolean live = true;
        Person(int age) {
            System.out.println("I was created: " + age);
            this.age = age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public void run() {
            while (live) {
                System.out.println("Hello! " + age);
                ++age;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public void die() {
            System.out.println("I died at " + age);
            live = false;
        }
    }

