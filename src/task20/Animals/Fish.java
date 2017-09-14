package task20.Animals;

public class Fish extends Wild {
    public Fish(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }

    @Override
    public void vote() {
        System.out.println(getAnimalId() + ": ....");
    }
}
