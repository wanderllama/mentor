package constructor;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, boolean pet) {
        super(name);
        this.pet = pet;
    }

    public Dog(String name, String sound, boolean pet, int numberOfLegs) {
        super(name);
//        this(name, pet);
        this.sound = sound;
        this.pet = pet;
        this.numberOfLegs = numberOfLegs;
    }

}
