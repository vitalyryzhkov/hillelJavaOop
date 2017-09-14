package task20.Animals;

public class Pet extends Animal {
    private String name;
    private boolean isVaccinated;

    public Pet(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }


    @Override
    public void vote() {
        System.out.println(getAnimalId() + ": Hello, my name is " + name + ".");

    }
}
