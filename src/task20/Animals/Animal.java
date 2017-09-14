package task20.Animals;

public abstract class Animal {
    private static int staticAnimalId = 0;

    private int animalId;
    private int age;
    private int weight;
    private String color;

    public Animal(int age, int weight, String color) {
        this.animalId = getStaticAnimalId();
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public abstract void vote();

    public int getAnimalId() {
        return animalId;
    }

    public int getStaticAnimalId() {
        return ++staticAnimalId;
    }
}
