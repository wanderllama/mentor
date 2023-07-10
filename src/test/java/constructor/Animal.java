package constructor;

public class Animal {

    String name;
    String size;
    String sound;
    boolean pet;
    int numberOfLegs;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", sound='" + sound + '\'' +
                ", pet=" + pet +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getSound() {
        return sound;
    }

    public boolean isPet() {
        return pet;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
