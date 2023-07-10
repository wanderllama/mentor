package constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateAnimals {

    public static void main(String[] args) {
        Cat cat = new Cat("melvin" , "meow", true, 4);
        Dog dog = new Dog("missy", "bark", true, 4);

        Object[] arr2 = new Object[2];
        arr2[0] = cat;
        arr2[1] = dog;

        Animal[] arr = new Animal[2];
        arr[0] = cat;
        arr[1] = dog;

        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].getName());
        System.out.println(arr[1].getNumberOfLegs());

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        System.out.println(animals.get(0).getName());
        System.out.println(animals);
        System.out.println(animals.get(1).toString());
        System.out.println(animals.get(1).isPet());
    }
}
