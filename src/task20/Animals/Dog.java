package task20.Animals;

public class Dog extends Pet {
    private boolean isTrained;
    private boolean isGuide;

    public Dog(int age, int weight, String color, String name, boolean isVaccinated,
               boolean isTrained, boolean isGuide) {
        super(age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
        this.isGuide = isGuide;
    }

    @Override
    public void vote() {
        super.vote();
        takeHome();
        System.out.println("Woof");
    }

    public void takeHome() {
        if (isTrained && isGuide) {
            System.out.println("I can take you home.");
        }
    }
}
