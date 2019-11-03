package asdasd;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetTwo {

    private String fuel;
    private String type;
    private int wheelSize;

    private SetTwo(String fuel, String type, int wheelSize) {
        this.fuel = fuel;
        this.type = type;
        this.wheelSize = wheelSize;
    }

    public static void main(String[] args) {


        SetTwo car1 = new SetTwo("diesel", "hatchback", 19);
        SetTwo car2 = new SetTwo("petrol", "sedan", 20);
        SetTwo car3 = new SetTwo("electric", "roadster", 21);
        SetTwo car4 = new SetTwo("diesel", "hatchback", 19);


        List<?> cars = Arrays.asList(car1, car2, car3, car4);

        HashSet<?> hashSet = new HashSet<>(cars);

        {
            System.out.println(" Cars in Order:");

            for (Object q : hashSet) {
                System.out.println(q);
            }

        }

    }
}

