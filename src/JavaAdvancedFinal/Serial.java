//package JavaAdvancedFinal;
//
//import java.io.*;
//
//
//public class Serial {
//    public static class Person implements Serializable {
//        private  String firstName;
//        private  String lastName;
//        private  int age;
//        private  String origin;
//
//        public String getFirstName() {
//            return firstName;
//        }
//
//        public void setFirstName(String firstName) {
//            this.firstName = firstName;
//        }
//
//        public String getLastName() {
//            return lastName;
//        }
//
//        public void setLastName(String lastName) {
//            this.lastName = lastName;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public String getOrigin() {
//            return origin;
//        }
//
//        public void setOrigin(String origin) {
//            this.origin = origin;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "firstName='" + firstName + '\'' +
//                    ", lastName='" + lastName + '\'' +
//                    ", age=" + age +
//                    ", origin='" + origin + '\'' +
//                    '}';
//        }
//
//        Person(String firstName, String lastName, int age, String origin) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.age = age;
//            this.origin = origin;
//        }
//
//        public static void main(String[] args) {
//
//
//            Person person = new Person("Richard", "Wittenberg", 29, "Latvia");
//
//            File file = new File("/Users/fudo/Desktop/Enums.txt");
//            try (FileOutputStream fileOutputStream = new FileOutputStream(file);
//                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
//                objectOutputStream.writeObject(person);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            Person dePerson = null;
//
//            try (FileInputStream fileInputStream = new FileInputStream(file);
//                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
//            {
//                dePerson = (Person) objectInputStream.readObject();
//
//            } catch (IOException | ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//            System.out.println(person);
//            System.out.println(dePerson);
//            person.setFirstName("Richie");
//            System.out.println(person);
//            System.out.println(dePerson);
//
//
//        }
//
//
//        }
//
//    }
//
//
//
