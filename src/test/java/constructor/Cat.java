package constructor;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, boolean pet) {
        super(name);
        this.pet = pet;
    }

    public Cat(String name, String sound, boolean pet, int numberOfLegs) {
        super(name);
//        this(name, pet);
        this.sound = sound;
        this.pet = pet;
        this.numberOfLegs = numberOfLegs;
    }
}
