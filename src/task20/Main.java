package task20;

import task20.Animals.*;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(1, 7, "black", "Lucky", true, true, true);
        dog.vote();

        Dog little = new Dog(1, 5, "Black", "liTTle", true, true, false);
        little.vote();

        Cat cat = new Cat(1, 4, "Black", "Kissyyy", true);
        cat.vote();

        Hamster hamster = new Hamster(1, 2, "Purple", "smallie", true);
        hamster.vote();

        Wolf wolf = new Wolf(1, 5, "Black", true);
        wolf.vote();

        Lion lion = new Lion(1, 5, "black", true);
        lion.vote();

        Crocodile crocodile = new Crocodile(1, 5, "Green", true);
        crocodile.vote();

        Fish fish = new Fish(1, 1, "colored", false);
        fish.vote();

        Giraffe giraffe = new Giraffe(1, 7, "Yellow", false);
        giraffe.vote();

    }
}
