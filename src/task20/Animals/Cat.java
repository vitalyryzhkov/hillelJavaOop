package task20.Animals;

public class Cat extends Pet {


    public Cat(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    @Override
    public void vote() {
        super.vote();
        System.out.println("Meow");
    }
}
