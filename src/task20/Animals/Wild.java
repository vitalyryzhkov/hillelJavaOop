package task20.Animals;

public class Wild extends Animal {
    private boolean isPredator;

    public Wild(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public void vote() {
        System.out.print(getAnimalId() + ": Hello, I am a wild animal");
        testIsPredator();
    }

    public void testIsPredator() {
        if (isPredator) {
            System.out.println(" and I am angry");
        }
    }
}
